plugins {
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("reproducer") {
            id = "dev.erichaag.reproducer"
            implementationClass = "dev.erichaag.reproducer.ReproducerPlugin"
        }
    }
}
