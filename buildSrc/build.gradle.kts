plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven {
      url = uri("https://jcenter.bintray.com/")
    } // Wichtig für serg.chuprin
}

dependencies {
    implementation("com.android.tools.build:gradle:9.0.0")
    implementation(kotlin("gradle-plugin", "1.9.20"))
    implementation("com.google.gms:google-services:4.3.4")
    implementation("de.mannodermaus.gradle.plugins:android-junit5:1.10.0.0")
    implementation("com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0")
    implementation("gradle.plugin.ru.cleverpumpkin.proguard-dictionaries-generator:plugin:1.0.8")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.2"
    }
}
