pluginManagement {
  includeBuild("convention-plugins")

  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

rootProject.name = extra["kalimantan.rootProjectName"] as String
