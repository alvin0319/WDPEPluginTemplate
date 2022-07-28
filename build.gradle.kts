import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.waterdog.dev/artifactory/main")
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.waterdog.waterdogpe:waterdog:1.1.9")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks {
    shadowJar {
        exclude("dev.waterdog.waterdogpe:waterdog:1.1.9")

        archiveClassifier.set("")
    }
}
