import com.soywiz.korge.gradle.korge

plugins {
    java
}

buildscript {

    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:2.7.0")
        classpath("com.soywiz.korlibs.korau:korau:2.7.0")
    }
}

apply<com.soywiz.korge.gradle.KorgeGradlePlugin>()

korge {
    id = "xyz.misilelaboratory.sample"
    targetJvm()
    targetDesktop()
    targetIos()
    targetAndroidIndirect() // targetAndroidDirect()
}
