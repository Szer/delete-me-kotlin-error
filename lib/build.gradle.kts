plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.30" // NOT OK
//    id("org.jetbrains.kotlin.jvm") version "1.5.10" // OK
    `java-library`
}

repositories {
    mavenCentral()
}

kotlin {
    tasks {
        compileKotlin {
            kotlinOptions {
                allWarningsAsErrors = true
                apiVersion = "1.5"
                languageVersion = "1.5"
                jvmTarget = "11"
                sourceCompatibility = "11"
                targetCompatibility = "11"
            }
        }
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(platform("org.testcontainers:testcontainers-bom:1.15.3"))
    implementation("org.testcontainers:postgresql")
}
