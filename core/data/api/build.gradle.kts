plugins {
    id("nowinandroid.android.library")
}

android {
    namespace = "com.google.samples.apps.nowinandroid.core.data.api"
}

dependencies {
    implementation(project(":core:network"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:model"))

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
}
