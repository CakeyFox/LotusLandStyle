import org.jetbrains.kotlin.cli.jvm.main

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.ktor.plugin") version "2.3.11"
}

group = "live.cakeyfox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    // Ktor
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:2.0.0")
    implementation("io.ktor:ktor-server-core:2.3.12")
    implementation("io.ktor:ktor-server-netty:2.3.12")
    testImplementation("io.ktor:ktor-server-test-host:2.3.12")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("live.cakeyfox.LauncherKt")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}