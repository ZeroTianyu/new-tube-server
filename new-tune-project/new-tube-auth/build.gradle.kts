dependencies {
    implementation(project(":new-tune-project:new-tube-common"))

    implementation(libs.spring.boot.starter.web)
    implementation(libs.lombok)
    annotationProcessor(libs.lombok)
}

tasks.test {

}
