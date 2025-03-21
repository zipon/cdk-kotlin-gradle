plugins {
    kotlin("jvm") version "2.1.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val cdkVersion  = "2.185.0"
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