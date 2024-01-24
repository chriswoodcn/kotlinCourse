plugins {
    kotlin("jvm") version "1.9.21"
}

group = "cn.chriswood.kotlincourse"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.google.code.gson:gson:2.8.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}