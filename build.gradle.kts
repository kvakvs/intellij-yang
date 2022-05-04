plugins {
    idea
    java
    id("org.jetbrains.kotlin.jvm") version "1.6.20"
    id("org.jetbrains.intellij") version "1.5.3"
    id("org.jetbrains.grammarkit") version "2021.1.2"
}

val intellijVersion = prop("intellijVersion")
val intelliLangPlugin = "org.intellij.intelliLang"
val psiViewerPluginVersion = prop("psiViewerPluginVersion")
val psiViewerPlugin = "PsiViewer:${prop("psiViewerPluginVersion")}"

repositories {
    mavenCentral()
}

allprojects {
    intellij { // See https://github.com/JetBrains/gradle-intellij-plugin/
        version.set(intellijVersion)
        // not found?    apply(plugin = "copyright")
        apply(plugin = "java")
    }
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
            java.srcDirs("src")
            resources.srcDirs("resources")
        }
    }

    idea {
        module {
            generatedSourceDirs.add(file("src/sr/clau/yang/gen"))
        }
    }

    intellij {
        plugins.set(
            listOf(
                intelliLangPlugin,
                psiViewerPlugin
            )
        )
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
