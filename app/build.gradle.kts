plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.kitchenkeeper"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kitchenkeeper"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.navigation.runtime)
    implementation(libs.androidx.navigation.ui)
    val appCompatVersion = "1.6.1"
    val constraintLayoutVersion = "2.1.4"
    val coreTestingVersion = "2.2.0"
    val lifecycleVersion = "2.8.0"
    val materialVersion = "1.12.0"
    val roomVersion = "2.6.1"
    // testing
    val junitVersion = "4.13.2"
    val espressoVersion = "3.4.0"
    val androidxJunitVersion = "1.1.5"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    implementation("androidx.navigation:navigation-fragment-ktx:2.1.0-alpha05")
    implementation("androidx.navigation:navigation-ui-ktx:2.1.0-alpha05")
    // Dependencies for working with Architecture components
    // You'll probably have to update the version numbers in build.gradle (Project)

    // Room components
    implementation("androidx.room:room-runtime:$roomVersion")
    annotationProcessor("androidx.room:room-compiler:$roomVersion")
    androidTestImplementation("androidx.room:room-testing:$roomVersion")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion")

    // UI
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation("com.google.android.material:material:$materialVersion")

    // Testing
    testImplementation("junit:junit:$junitVersion")
    androidTestImplementation("androidx.arch.core:core-testing:$coreTestingVersion")
    //androidTestImplementation ("androidx.test.espresso:espresso-core:espressoVersion", {
        //exclude group: 'com.android.support', module: 'support-annotations'
    //})
    androidTestImplementation("androidx.test.ext:junit:$androidxJunitVersion")
}