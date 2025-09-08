plugins {
//    alias(libs.plugins.spring.boot)
//    alias(libs.plugins.spring.dependency.management)
}



dependencies {
    implementation(libs.bundles.newtube.boot)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.bundles.newtube.boot.test)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)

    runtimeOnly(libs.mysql)
}





