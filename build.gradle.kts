plugins {
    java
    kotlin("jvm") version "1.6.10"
    id("fabric-loom")
}

group = "me.chell"
version = "1.0"

dependencies {
    implementation(files(property("samsara_jar")))

    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${property("loader_version")}")
}