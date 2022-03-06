plugins {
    java
    antlr
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("maven-publish")
}

group = "me.hydos"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.9.3")
    implementation("org.antlr:antlr4-runtime:4.9.3")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    source = sourceSets["main"].antlr

    outputDirectory = file("src/main/java/me/hydos/antlr")
}

tasks.clean {
    doLast {
        file("generated-src").delete()
    }
}

tasks.shadowJar {
    manifest {
        attributes(mapOf("Main-Class" to "me.hydos.ruva.ProjectConverter"))
    }
}

tasks.build {
    dependsOn(tasks.shadowJar)
}

tasks.publishToMavenLocal {
    dependsOn(tasks.shadowJar)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
