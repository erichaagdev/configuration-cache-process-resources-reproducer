plugins {
    `java-gradle-plugin`
    kotlin("jvm") version embeddedKotlinVersion
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
