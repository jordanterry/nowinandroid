plugins {
    id("nowinandroid.android.library")
    id("nowinandroid.android.hilt")
}

android {
    namespace = "com.google.samples.apps.nowinandroid.core.data.di"
}

dependencies {
    api(project(":core:data:api"))
    api(project(":core:data:implementation"))
}
