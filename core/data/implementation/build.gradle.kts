plugins {
    id("nowinandroid.android.library")
    id("nowinandroid.android.hilt")
}

android {
    namespace = "com.google.samples.apps.nowinandroid.core.data.implementation"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    implementation(project(":core:analytics"))
    implementation(project(":core:common"))
    implementation(project(":core:data:api"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:model"))
    implementation(project(":core:network"))
    implementation(project(":core:notifications"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(project(":core:datastore-test"))
    testImplementation(project(":core:testing"))
}
