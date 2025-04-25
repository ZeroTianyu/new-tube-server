dependencies {
    implementation(project(":new-tube-project:new-tube-common"))
    implementation(libs.bundles.newtube.boot)
    testImplementation(libs.bundles.newtube.boot.test)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    runtimeOnly(libs.mysql)
}

tasks.test {
    useJUnitPlatform()
}
