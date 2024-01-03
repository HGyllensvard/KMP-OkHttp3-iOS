plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "kotlinmultiplatformsharedmodule"
            isStatic = true
        }
    }

    js(IR) {
        moduleName = "jsKmp"

        nodejs()
        binaries.library()

        generateTypeScriptDefinitions()
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(libs.okhttp3)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "au.airtasker.kotlinmultiplatformsharedmodule"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
