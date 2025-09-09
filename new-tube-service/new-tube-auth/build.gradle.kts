dependencies {
    implementation(libs.bundles.newtube.boot)
    implementation(libs.sa.token)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.bundles.newtube.boot.test)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)

    runtimeOnly(libs.mysql)
}





