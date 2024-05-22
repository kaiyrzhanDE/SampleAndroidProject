package config

internal data class Android(
    val targetSdk: Int = 34,
    val compileSdk: Int = 34,
    val minSdk: Int = 24,
    val applicationId: String = "standard.sample.project",
    val versionCode: Int = 1,
    val versionName: String = "1.0",
    val namespace: String = "standard.sample.project",
    val testInstrumentationRunner: String = "androidx.test.runner.AndroidJunitRunner",
)
