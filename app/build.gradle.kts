plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("io.realm.kotlin")



}

android {
    namespace = "com.mz.cannainfinity"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mz.cannainfinity"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "17"

    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation ("androidx.compose.ui:ui:1.7.0-alpha03")
    implementation ("androidx.compose.compiler:compiler:1.5.10")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation ("com.google.dagger:hilt-android:2.49")
    ksp ("com.google.dagger:hilt-compiler:2.48")
    implementation ("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Compose Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.activity:activity-compose:1.8.2")

    ///implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    ///implementation("com.google.firebase:firebase-storage-ktx:22.3.1")

// Room components
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    /// Realm
    implementation ("io.realm.kotlin:library-base:1.11.0")
    implementation ("io.realm.kotlin:library-sync:1.11.0")// If using Device Sync
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")

// Runtime Compose
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")

// Splash API
    implementation("androidx.core:core-splashscreen:1.0.1")

// Mongo DB Realm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("io.realm.kotlin:library-sync:1.11.0")

    /// Google Auth
    ///implementation("com.google.android.gms:play-services-auth:21.0.0")
    ///implementation ("com.google.firebase:firebase-analytics")

// Coil
    implementation("io.coil-kt:coil-compose:2.4.0")

// Pager - Accompanist
    implementation("com.google.accompanist:accompanist-pager:0.27.0")

// Date-Time Picker
    implementation("com.maxkeppeler.sheets-compose-dialogs:core:1.0.2")

// CALENDAR
    implementation("com.maxkeppeler.sheets-compose-dialogs:calendar:1.0.2")

// CLOCK
    implementation("com.maxkeppeler.sheets-compose-dialogs:clock:1.0.2")

// Message Bar Compose
    implementation("com.github.stevdza-san:MessageBarCompose:1.0.5")

// One-Tap Compose
    implementation("com.github.stevdza-san:OneTapCompose:1.0.0")

// Desugar JDK
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")



    /// Material 3
    implementation ("androidx.compose.material3:material3:1.2.0")
}
