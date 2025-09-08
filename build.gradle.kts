//
plugins {
    java
    idea
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
}


allprojects {


    apply(plugin = "java")
    apply(plugin = "idea")

    group = "com.newtube"
    version = "1.0-SNAPSHOT"


    // 配置字符编码
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }


    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }



    repositories {
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        mavenCentral()
    }


}



