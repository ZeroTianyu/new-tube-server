dependencies {
    implementation(project(":new-tube-project:new-tube-common"))
    implementation(libs.bundles.newtube.boot)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.bundles.newtube.boot.test)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)

    runtimeOnly(libs.mysql)
}


springBoot {
    mainClass.set("com.newtube.auth.AuthApplication")
}

tasks.test {
    useJUnitPlatform()
}
