plugins {
    id("java")
}

group = "de.jo0001"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.javadoc {
    destinationDir = file("$buildDir/custom-javadoc")
}
