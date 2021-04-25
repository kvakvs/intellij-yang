plugins {
    java
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("org.jetbrains.intellij") version "0.7.2"
}

repositories {
    mavenCentral()
}

intellij { // See https://github.com/JetBrains/gradle-intellij-plugin/
    version = "2021.1"
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
}
//}