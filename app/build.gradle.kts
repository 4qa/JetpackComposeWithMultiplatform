
plugins {
    id("com.android.application")
    kotlin("multiplatform")
    //id("kotlin-android")
//    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.myapplication"
    compileSdkVersion(33)

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdkVersion(29)
        targetSdkVersion(33)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_17
        sourceCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
//    composeOptions {
//        kotlinCompilerVersion = "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
//        kotlinCompilerExtensionVersion = "0.1.0-dev10"
//    }
}

//tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}

kotlin {
    jvmToolchain(17)
    targets {
        android()
    }

    sourceSets["androidMain"].dependencies {

        compileOnly("javax.annotation:jsr250-api:1.0")

//        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${rootProject.extra["kotlin_version"]}")
        implementation("androidx.core:core-ktx:1.10.1")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.9.0")

        implementation("androidx.compose.ui:ui:1.4.3")
        implementation("androidx.compose.material:material:1.4.3")
        implementation("androidx.compose.ui:ui-tooling:1.4.3")
        implementation("androidx.activity:activity-compose:1.7.2")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("com.github.pengrad:jdk9-deps:1.0")

    }
}
/*
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("androidx.ui:ui-framework:0.1.0-dev10")
    implementation("androidx.ui:ui-layout:0.1.0-dev10")
    implementation("androidx.ui:ui-material:0.1.0-dev10")
    implementation("androidx.ui:ui-tooling:0.1.0-dev10")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.github.pengrad:jdk9-deps:1.0")

}*/


