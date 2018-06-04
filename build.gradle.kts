import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion = "1.2.41"
val junitVersion = "5.2.0"

plugins {
    kotlin("jvm") version "1.2.41"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib", kotlinVersion))

    compile(group = "com.squareup.retrofit2", name = "retrofit", version = "2.4.0")
    compile(group = "com.squareup.retrofit2", name = "converter-jackson", version = "2.4.0")
    compile(group = "com.fasterxml.jackson.module", name = "jackson-module-kotlin", version = "2.9.5")

    testCompile(group = "org.jetbrains.kotlin", name = "kotlin-stdlib", version = kotlinVersion)
    testImplementation(group = "org.junit", name = "junit-bom", version = junitVersion)
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api")
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.javaParameters = true
    kotlinOptions.jvmTarget = "1.8"
}
