import org.gradle.kotlin.dsl.named
import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
    java
    idea
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
}



allprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.springframework.boot")


    group = "com.newtube"
    version = "1.0-SNAPSHOT"

    repositories {
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        mavenCentral()
    }
}

subprojects {

    val buildEnv = project.findProperty("buildEnv")?.toString() ?: "dev"

    tasks.named<ProcessResources>("processResources") {
        from("src/main/resources") {
            exclude("**/application-*.yml")
        }

        from("src/main/resources") {
            include("application-$buildEnv.yml")
            rename("application-$buildEnv.yml", "application.yml")
        }

        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}


dependencies {

}

tasks.test {

}