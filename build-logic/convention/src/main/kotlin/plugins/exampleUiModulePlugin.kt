package plugins

/**
 * Example of feature module plugin
 *
 *class UiModulePlugin: Plugin<Project> {
 *    override fun apply(target: Project) = with(target) {
 *        with(pluginManager) {
 *            apply("com.android.library")
 *            apply("org.jetbrains.kotlin.android")
 *        }
 *        configureLibraryAndroid()
 *        configureDI<LibraryExtension>()
 *        configureCompose<LibraryExtension>()
 *        configureNavigation()
 *    }
 *}
 */