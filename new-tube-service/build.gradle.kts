
subprojects{
    plugins.apply("org.springframework.boot")
    plugins.apply("io.spring.dependency-management")
}

tasks.test {
    useJUnitPlatform()
}