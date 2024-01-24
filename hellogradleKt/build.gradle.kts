plugins {
    kotlin("jvm") version "1.9.21"
}

group = "cn.chriswood.kotlincourse"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}
tasks.named<Test>("test"){

}
tasks.test {
    useJUnitPlatform()
}