import com.google.protobuf.gradle.ExecutableLocator
import com.google.protobuf.gradle.GenerateProtoTask
import de.undercouch.gradle.tasks.download.Download

plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.dokka") version "1.8.10"
    id("maven-publish")
    id("signing")
    id("de.undercouch.download") version "5.4.0"
    id("com.google.protobuf") version "0.9.4"
}

group = "io.github.husnjak"
version = findProperty("version") as String

val fuelVersion = "2.3.1"
val protobufJavaVersion = "3.24.3"
val junitJupiterVersion = "5.10.0"
val junitPlatformVersion = "1.10.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib"))
    // HTTP
    implementation("com.github.kittinunf.fuel:fuel:$fuelVersion")
    implementation("com.github.kittinunf.fuel:fuel-gson:$fuelVersion")
    implementation("com.github.kittinunf.fuel:fuel-android:$fuelVersion")
    // Protocol Buffers
      // set to api() to add protobuf to client classpath
    api("com.google.protobuf:protobuf-java:$protobufJavaVersion")
    implementation("com.google.protobuf:protobuf-gradle-plugin:0.9.4")
    // Tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:$junitPlatformVersion")

}

sourceSets {
    main {
        resources {
            srcDirs("$projectDir/src/resources") // protofile
        }
        proto {
            srcDirs("$projectDir/src/resources")
        }
    }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }
    dokkaJavadoc {
        outputDirectory.set(buildDir.resolve("javadoc"))
        dependsOn(getTasksByName("generateProto", true))
    }
    withType<GenerateProtoTask> {
        dependsOn("downloadProtoFiles")
    }
    processResources{
        dependsOn(getTasksByName("generateProto", true))
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufJavaVersion"
    }
    generatedFilesBaseDir = "$projectDir/generatedProtoFiles"
}

 tasks.register("downloadProtoFiles",Download::class) {
    this.src("https://api.igdb.com/v4/igdbapi.proto")
    this.dest("$projectDir/src/resources/com/api/igdb/igdbproto.proto")
    this.overwrite(true)
}

val dokkaJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    archiveClassifier.set("javadoc")
    from(tasks.dokkaJavadoc)
}

val sourcesJar by tasks.creating(Jar::class) {
    dependsOn("generateProto")
    manifest {
        attributes("Main-Class" to "com.api.igdb.ApiRequesterKt")
    }
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles sources jar"
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifact(dokkaJar)
            artifact(sourcesJar)

            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }

            pom {
                name.set("igdb-api-jvm")
                description.set("Kotlin wrapper for the IGDB API compiled for the JVM.")
                url.set("https://github.com/husnjak/igdb-api-jvm.git")
                licenses {
                    license {
                        name.set("The MIT License (MIT)")
                        url.set("https://mit-license.org")
                    }
                }
                developers {
                    developer {
                        id.set("husnjak")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/husnjak/IGDB-API-JVM.git")
                    developerConnection.set("scm:git:git@github.com:husnjak/IGDB-API-JVM.git")
                    url.set("https://github.com/husnjak/IGDB-API-JVM")
                }
            }
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/husnjak/igdb-api-jvm")
            credentials {
                username = findProperty("github_actor") as String?
                password = findProperty("github_token") as String?
            }
        }
        maven {
            name = "Sonatype"
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().contains("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            println("Sonatype release version: $version using: $url")
            credentials {
                username = findProperty("sonatype_username") as String?
                password = findProperty("sonatype_password") as String?
            }
        }
    }
}

signing {
    val isJitpack = System.getenv("JITPACK") ?: ""
    if (isJitpack == "true"){
        return@signing
    }

    if (version.toString().contains("local")) {
        useGpgCmd()
    } else {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
    }
    sign(publishing.publications["maven"])
}