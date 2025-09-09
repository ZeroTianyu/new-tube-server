rootProject.name = "new-tube-server"
include("new-tube-common")
include("new-tube-service")
include("new-tube-service:new-tube-auth")

pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        gradlePluginPortal()
        mavenCentral()
    }
}
