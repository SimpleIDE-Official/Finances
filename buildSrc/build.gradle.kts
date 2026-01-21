plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    // Stellt sicher, dass Kotlin in buildSrc verfügbar ist
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")

    // WICHTIG: Dies stellt die Klasse 'com.android.build.gradle.BaseExtension' 
    // für deine Skripte in buildSrc zur Verfügung.
    // Wenn du eine andere AGP Version nutzt, passe sie hier an.
    implementation("com.android.tools.build:gradle:8.2.2")
    
    // Falls du XML Parsing oder andere Utils in buildSrc nutzt:
    implementation(gradleApi())
    implementation(localGroovy())
}
