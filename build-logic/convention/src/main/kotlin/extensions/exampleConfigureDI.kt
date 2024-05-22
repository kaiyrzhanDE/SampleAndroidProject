package extensions

/**
 * Example of configuring DI frameworks (Dagger, Koin, Hilt and etc.)
 *
 *internal inline fun <reified T : CommonExtension<*, *, *, *>> Project.configureDI() {
 *    extensions.getByType<T>().apply {
 *        with(plugins) {
 *            apply("dagger.hilt.android.plugin")
 *            apply("kotlin-kapt")
 *        }
 *
 *        dependencies {
 *            add(IMPLEMENTATION, project.getLibrary("com-google-dagger-hilt-android"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-hilt-navigation-compose"))
 *            add(KAPT, project.getLibrary("androidx-hilt-compiler"))
 *            add(KAPT, project.getLibrary("com-google-dagger-hilt-android-compiler"))
 *        }
 *    }
 *}
 */