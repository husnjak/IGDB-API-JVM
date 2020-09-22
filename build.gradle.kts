import com.google.protobuf.gradle.ExecutableLocator
import com.google.protobuf.gradle.GenerateProtoTask
import de.undercouch.gradle.tasks.download.Download

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.jetbrains.dokka") version "0.10.1"
    id("maven-publish")
    id("de.undercouch.download") version "4.0.4"
    id("com.google.protobuf") version "0.8.12"
}

group = "com.api.igdb"
version = "1.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    // HTTP
    implementation("com.github.kittinunf.fuel:fuel:2.2.3")
    implementation("com.github.kittinunf.fuel:fuel-gson:2.2.3")
    // Protocol Buffers
    implementation("com.google.protobuf:protobuf-java:3.11.0")
    // Tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.6.2")
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
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    dokka {
        outputFormat = "html"
        outputDirectory = "$buildDir/javadoc"
    }
    withType<GenerateProtoTask> {
        dependsOn(downloadProtoFiles)
    }
}

protobuf.protobuf.run {
    protoc(delegateClosureOf<ExecutableLocator> {
        artifact = "com.google.protobuf:protoc:3.7.0"
    })
    generatedFilesBaseDir = "$projectDir/src"
}

val downloadProtoFiles by tasks.creating(Download::class) {
    src("https://api.igdb.com/v4/igdbapi.proto")
    dest("$projectDir/src/resources/com/api/igdb/igdbproto.proto")
    overwrite(true)
}

val dokkaJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    archiveClassifier.set("javadoc")
    from(tasks.dokka)
}

val sourcesJar by tasks.creating(Jar::class) {
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
        create<MavenPublication>("default") {
            from(components["kotlin"])
            artifact(dokkaJar)
            artifact(sourcesJar)

            // Custom POM
            pom {
                description.set("Kotlin wrapper for the IGDB API compiled for the JVM.")
                url.set("https://github.com/husnjak/IGDB-API-JVM")
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
            }
        }
    }
    repositories {
        maven {
            url = uri("$buildDir/repository")
        }
    }
}