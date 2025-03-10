pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

sourceControl {
    gitRepository(uri("https://github.com/mirror-kt/fabrikt")) {
        producesModule("com.cjbooms:fabrikt")
    }
}

rootProject.name = "fabrikt-gradle-plugin"
