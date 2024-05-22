package extensions

/**
 * Example of configuring DI frameworks (Dagger, Koin, Hilt and etc.)
 *
 *internal inline fun <reified T : CommonExtension<*, *, *, *>> Project.configureCompose() {
 *    extensions.getByType<T>().apply {
 *        buildFeatures {
 *            compose = true
 *        }
 *
 *        composeOptions {
 *            kotlinCompilerExtensionVersion =
 *                project.getVersion("kotlin-compiler-extension").toString()
 *        }
 *
 *        dependencies {
 *            add(IMPLEMENTATION, project.getLibrary("androidx-activity-compose"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-compose-bom"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-compose-ui"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-compose-ui-graphics"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-compose-ui-tooling-preview"))
 *            add(IMPLEMENTATION, project.getLibrary("androidx-compose-material3"))
 *
 *            add(TEST_IMPLEMENTATION, project.getLibrary("androidx-test-compose-bom"))
 *            add(TEST_IMPLEMENTATION, project.getLibrary("androidx-compose-ui-test-junit4"))
 *
 *            add(DEBUG_IMPLEMENTATION, project.getLibrary("androidx-compose-ui-tooling"))
 *            add(DEBUG_IMPLEMENTATION, project.getLibrary("androidx-compose-ui-test-manifest"))
 *        }
 *    }
 *}
 */