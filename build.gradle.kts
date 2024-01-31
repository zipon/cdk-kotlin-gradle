plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val cdkVersion  = "2.124.0"
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("software.amazon.awscdk","aws-cdk-lib",  cdkVersion)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.orange.MainKt")
}