import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

    /**
     * http://tools.android.com
     */
    const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
        Versions.constraintlayout

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val recyclerview: String = "androidx.recyclerview:recyclerview:" + Versions.recyclerview

    /**
     * https://developer.android.com/studio
     */
    const val aapt2: String = "com.android.tools.build:aapt2:" + Versions.aapt2

    /**
     * https://developer.android.com/studio
     */
    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
        Versions.com_android_tools_build_gradle

    /**
     * https://developer.android.com/studio
     */
    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    const val de_fayard_buildsrcversions_gradle_plugin: String =
        "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * http://mockk.io
     */
    const val mockk_common: String = "io.mockk:mockk-common:" + Versions.io_mockk

    /**
     * http://mockk.io
     */
    const val mockk: String = "io.mockk:mockk:" + Versions.io_mockk

    const val dokka_gradle_plugin: String = "org.jetbrains.dokka:dokka-gradle-plugin:" +
        Versions.dokka_gradle_plugin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions_runtime: String =
        "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions: String =
        "org.jetbrains.kotlin:kotlin-android-extensions:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_annotation_processing_gradle: String =
        "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:" + Versions.org_jetbrains_kotlin

    const val kotlin_compiler_embeddable: String =
        "org.jetbrains.kotlin:kotlin-compiler-embeddable:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
        Versions.org_jetbrains_kotlin

    const val kotlin_klib_commonizer_embeddable: String =
        "org.jetbrains.kotlin:kotlin-klib-commonizer-embeddable:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_scripting_compiler_embeddable: String =
        "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" + Versions.org_jetbrains_kotlin

    /**
     * 1.3.72
     */
    const val kotlin_stdlib_common: String = "org.jetbrains.kotlin:kotlin-stdlib-common:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
        Versions.org_jetbrains_kotlin

    /**
     * 1.3.72
     */
    const val kotlin_stdlib_js: String = "org.jetbrains.kotlin:kotlin-stdlib-js:" +
        Versions.org_jetbrains_kotlin

    /**
     * 1.3.72
     */
    const val kotlin_stdlib: String = "org.jetbrains.kotlin:kotlin-stdlib:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_test_annotations_common: String =
        "org.jetbrains.kotlin:kotlin-test-annotations-common:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_test_common: String = "org.jetbrains.kotlin:kotlin-test-common:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_test_js: String = "org.jetbrains.kotlin:kotlin-test-js:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_test_junit: String = "org.jetbrains.kotlin:kotlin-test-junit:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_test: String = "org.jetbrains.kotlin:kotlin-test:" +
        Versions.org_jetbrains_kotlin

    /**
     * https://github.com/Kotlin/atomicfu
     */
    const val atomicfu_gradle_plugin: String = "org.jetbrains.kotlinx:atomicfu-gradle-plugin:" +
        Versions.atomicfu_gradle_plugin

    /**
     * https://github.com/Kotlin/atomicfu
     */
    const val atomicfu: String = "org.jetbrains.kotlinx:atomicfu:" + Versions.atomicfu

    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val kotlinx_coroutines_core_jvm: String =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:" + Versions.kotlinx_coroutines_core_jvm

    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val kotlinx_coroutines_core: String = "org.jetbrains.kotlinx:kotlinx-coroutines-core:" +
        Versions.kotlinx_coroutines_core

    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val kotlinx_coroutines_test: String = "org.jetbrains.kotlinx:kotlinx-coroutines-test:" +
        Versions.kotlinx_coroutines_test
}