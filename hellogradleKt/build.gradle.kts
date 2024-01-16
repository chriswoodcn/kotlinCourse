plugins {
    kotlin("jvm") version "1.9.21"
    id("application")
}

group = "cn.chriswood"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

tasks.test {
    useJUnitPlatform()
}
application {
    mainClass = "cn.chriswood.hellogradleKt.Main"
}