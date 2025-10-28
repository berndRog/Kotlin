plugins {
   kotlin("jvm") version "2.2.0"
}

group = "de.rogallab.mobile"
version = "1.0-SNAPSHOT"

repositories {
   mavenCentral()
}

dependencies {
   implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
   testImplementation("junit:junit:4.13.2")
   testImplementation(kotlin("test"))  // includes kotlin-test-junit for JUnit4
   testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
}

kotlin {
   jvmToolchain(17)
}