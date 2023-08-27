rootProject.name = "spring-multi-module"

pluginManagement {
    val kotlinVersion = "1.8.22"
    val springBootVersion = "3.1.2"
    val dependencyManagementVersion = "1.1.2"
    val protobufVersion = "0.8.15" // for gRPC

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
        id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion

        id("com.google.protobuf") version protobufVersion // gRPC
    }
}

include(
    "commons:common"
)