pluginManagement {
  listOf(repositories, dependencyResolutionManagement.repositories).forEach {
    it.apply {
      mavenCentral()
      google()
      mavenLocal()
    }
  }
}

include(":module1", ":module2")