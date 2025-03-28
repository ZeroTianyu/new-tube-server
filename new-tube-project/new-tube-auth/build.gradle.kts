dependencies {
    implementation(project(":new-tube-project:new-tube-common"))
    implementation(libs.bundles.newtube.boot)
    annotationProcessor(libs.lombok)
}

tasks.test {

}
