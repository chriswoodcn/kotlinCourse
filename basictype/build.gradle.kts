plugins {
    kotlin("jvm") version "1.9.21"
    id("application")
}

group = "cn.chriswood"
version = "1.0-SNAPSHOT"


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
application {
    mainClass = "cn.chriswood.basicType.Main"
}