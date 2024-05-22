package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import utils.DEBUG
import utils.RELEASE

@Suppress("UnstableApiUsage")
internal inline fun <reified T : CommonExtension<*, *, *, *>> Project.configureBuildTypes() {
    extensions.getByType<T>().apply {
        buildTypes {
            getByName(RELEASE) {
                isMinifyEnabled = false
//                buildConfigField("STRING","BASE_URL","baseUrlRelease")
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            getByName(DEBUG){
                isMinifyEnabled = false
//                buildConfigField("STRING","BASE_URL","baseUrlDebug")
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
}