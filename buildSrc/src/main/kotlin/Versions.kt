import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    /**
     * https://developer.android.com/studio
     */

    const val com_android_tools_build_gradle: String = "4.0.1"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val dokka_gradle_plugin: String = "0.9.17" // available: "0.11.0-dev-59"

    const val org_jetbrains_kotlin: String = "1.4.0"

    const val org_reduxkotlin_redux_kotlin: String = "0.5.5"

    /**
     *
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.6"

    const val gradleCurrentVersion: String = "6.6"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
        id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
