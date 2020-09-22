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

group = "com.igdb"
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
    dest("$projectDir/src/resources/com/igdb/igdbproto.proto")
    overwrite(true)
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