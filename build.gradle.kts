plugins{
    java
    idea
    alias(libs.plugins.spring.boot)
}



allprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
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


dependencies {

}

tasks.test {

}