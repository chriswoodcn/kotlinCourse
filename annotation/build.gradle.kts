plugins {
    kotlin("jvm") version "1.9.21"
    id("application")
}

group = "cn.chriswood.kotlincourse"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.squareup.okhttp3:okhttp:3.14.0")
    implementation("com.google.code.gson:gson:2.8.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}