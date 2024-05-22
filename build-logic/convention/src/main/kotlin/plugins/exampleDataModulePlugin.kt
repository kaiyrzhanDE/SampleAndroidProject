package plugins

/**
 * Example of feature module plugin
 *
 *class DataModulePlugin : Plugin<Project> {
 *    override fun apply(target: Project) = with(target) {
 *        with(pluginManager) {
 *            apply("com.android.library")
 *            apply("org.jetbrains.kotlin.android")
 *        }
 *        configureLibraryAndroid()
 *        configureDI<LibraryExtension>()
 *        configureNetwork()
 *    }
 *}
 */