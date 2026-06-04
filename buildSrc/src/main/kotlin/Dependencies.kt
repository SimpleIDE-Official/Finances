import BuildScript.Versions.KOTLIN_VER
import BuildScript.Versions.NAVIGATION_VER
import Libraries.Coroutines.VER

/**
 * Created by Sergey Chuprin on 16.03.2019.
 */
object BuildScript {

    object Versions {
        const val KOTLIN_VER = "1.9.20"
        const val NAVIGATION_VER = "2.3.2"
    }

    object Plugins {
        const val GMS = "com.google.gms:google-services:4.3.4"
        
        // Nutze eine stabile AGP Version (9.0.0 ist oft noch experimentell/beta)
        const val ANDROID = "com.android.tools.build:gradle:8.2.2" 
        
        const val JUNIT5 = "de.mannodermaus.gradle.plugins:android-junit5:1.10.0.0"
        
        // Das Haupt-Kotlin-Plugin (beinhaltet Parcelize Logik)
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VER"
        
        // NEU: Parcelize Plugin ID für die Verwendung in Modulen
        const val PARCELIZE = "kotlin-parcelize"

        const val NAVIGATION =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$NAVIGATION_VER"
        const val GRAPH_VISUALIZER =
            "com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0"
        const val PROGUARD_GENERATOR =
            "gradle.plugin.ru.cleverpumpkin.proguard-dictionaries-generator:plugin:1.0.8"
    }

}

object Libraries {

    const val COIL = "io.coil-kt:coil:1.1.0"
    const val TIMBER = "com.github.ajalt:timberkt:1.5.1"
    const val FLEXBOX = "com.google.android:flexbox:2.0.1"
    const val DESUGARING = "com.android.tools:desugar_jdk_libs:1.1.1"
    const val INSETTER = "dev.chrisbanes.insetter:insetter-dbx:0.3.1"

    object Coroutines {
        const val VER = "1.7.3"
        const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VER"
        const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VER"
    }

    object AndroidX {
        const val CORE = "androidx.core:core-ktx:1.19.0"
        const val APPCOMPAT = "androidx.appcompat:appcompat:1.6.1"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.6.2"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.3.2"
        const val PREFERENCE = "androidx.preference:preference-ktx:1.2.1"
        const val MATERIAL = "com.google.android.material:material:1.11.0"
        const val VIEW_PAGER = "androidx.viewpager2:viewpager2:1.0.0"

        object Lifecycle {
            private const val VER = "2.7.0"
            const val COMMON = "androidx.lifecycle:lifecycle-common-java8:$VER"
            const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VER"
            const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$VER"
        }

        object Navigation {
            const val FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VER"
            const val UI = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VER"
        }

    }

    object Mvi {
        private const val VER = "3.0.1"
        const val CORE = "com.arkivanov.mvikotlin:mvikotlin:$VER"
        const val MAIN = "com.arkivanov.mvikotlin:mvikotlin-main:$VER"
        const val LOGGING = "com.arkivanov.mvikotlin:mvikotlin-logging:$VER"
        const val COROUTINES = "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:$VER"
    }

    object Dagger {
        private const val VER = "2.50"
        const val LIB = "com.google.dagger:dagger:$VER"
        const val COMPILER = "com.google.dagger:dagger-compiler:$VER"
    }

    object Firebase {
        const val BOM = "com.google.firebase:firebase-bom:26.2.0"
        const val ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
        const val CRASHLYTICS = "com.google.firebase:firebase-crashlytics-ktx"
        const val AUTH = "com.google.firebase:firebase-auth-ktx:20.0.2"
        const val FIRESTORE = "com.google.firebase:firebase-firestore-ktx:22.0.1"
        const val GMS_AUTH = "com.google.android.gms:play-services-auth:19.0.0"
        const val PLAY_SERVICES_KTX = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.4.2"
    }

    object DebugMenu {
        private const val VER = "2.4.4"

        const val DEBUG = "com.github.pandulapeter.beagle:ui-drawer:$VER"
        const val RELEASE = "com.github.pandulapeter.beagle:noop:$VER"

    }

    object Tests {

        private const val JUNIT_VER = "5.7.0"
        private const val SPEK_VER = "2.0.15"

        const val MOCKK = "io.mockk:mockk:1.9.3"
        const val STRIKT = "io.strikt:strikt-core:0.28.1"

        // It's required for Strikt.
        const val FILE_PEEK = "com.christophsturm:filepeek:0.1.2"
        const val ASSERTIONS = "org.jetbrains.kotlin:kotlin-test:$KOTLIN_VER"
        const val SPEK_JVM = "org.spekframework.spek2:spek-dsl-jvm:$SPEK_VER"
        const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${VER}"
        const val JUNIT_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VER"
        const val SPEK_RUNNER = "org.spekframework.spek2:spek-runner-junit5:$SPEK_VER"

    }

}
