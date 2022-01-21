plugins {
    java
    kotlin("jvm") version "1.6.10"
    id("fabric-loom")
}

group = "me.chell"
version = "1.0"

repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.chell-dev:Samsara:${property("samsara_version")}")

    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${property("loader_version")}")
}