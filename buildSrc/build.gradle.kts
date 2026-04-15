plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    // Stellt das Kotlin Gradle Plugin bereit (inkl. Parcelize Logik)
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")

    // Stellt die Android Gradle Klassen bereit (BaseExtension etc.)
    // Achtung: Version muss kompatibel mit deiner Dependencies.kt sein.
    implementation("com.android.tools.build:gradle:9.1.1")
    
    // Hilfreich für Plugin-Entwicklung
    implementation(gradleApi())
    implementation(localGroovy())
}
