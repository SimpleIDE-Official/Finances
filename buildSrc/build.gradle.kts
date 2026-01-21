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
    implementation("com.android.tools.build:gradle:9.0.0"
    implementation(kotlin("gradle-plugin", "1.6.10"))
}
