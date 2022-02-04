plugins {
    java
    kotlin("jvm") version "1.6.10"
    id("fabric-loom")
}

val minecraftVersion: String by project
val yarnMappings: String by project
val loaderVersion: String by project

val apiVersion: String by project
val luajVersion: String by project
val discordVersion: String by project

val kotlinVersion: String by project
val coroutinesVersion: String by project
val serializationVersion: String by project

repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.chell-dev:Samsara:$apiVersion")

    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings("net.fabricmc:yarn:$yarnMappings:v2")
    modImplementation("net.fabricmc:fabric-loader:$loaderVersion")

    implementation("org.luaj:luaj-jse:$luajVersion")
    implementation("com.github.NepNep21:DiscordRPC4j16:$discordVersion")

    implementation(kotlin("stdlib", kotlinVersion))
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
    implementation(kotlin("stdlib-jdk7", kotlinVersion))
    implementation(kotlin("reflect", kotlinVersion))
}

tasks.processResources {
    val jsonFile = file("src/main/resources/fabric.mod.json")
    val parsedJson = groovy.json.JsonSlurper().parseText(jsonFile.readText()) as Map<*, *>
    version = parsedJson["version"]!!
}