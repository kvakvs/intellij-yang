plugins {
    idea
    java
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("org.jetbrains.intellij") version "0.7.2"
}

val intelliLangPlugin = "org.intellij.intelliLang"
val psiViewerPluginVersion = prop("psiViewerPluginVersion")
val psiViewerPlugin = "PsiViewer:${prop("psiViewerPluginVersion")}"

repositories {
    mavenCentral()
}

intellij { // See https://github.com/JetBrains/gradle-intellij-plugin/
    version = prop("intellijVersion")
    // not found?    apply(plugin = "copyright")
    apply(plugin = "java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions.freeCompilerArgs += "-Xjvm-default=enable"
compileKotlin.kotlinOptions.jvmTarget = "11"

allprojects {
    sourceSets {
        main {
            java.srcDirs("src", "gen")
            resources.srcDirs("resources")
        }
    }

    idea {
        module {
            generatedSourceDirs.add(file("gen"))
        }
    }

    intellij {
        val plugins = mutableListOf(
            intelliLangPlugin,
            psiViewerPlugin
        )
        setPlugins(*plugins.toTypedArray())
    }

    tasks {
        runIde {
            jvmArgs("-Xmx2000m")
        }
    }
}
//}

fun prop(name: String): String =
    extra.properties[name] as? String
        ?: error("Property `$name` is not defined in gradle.properties")
