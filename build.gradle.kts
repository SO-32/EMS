plugins {
    `java-library`
    id("io.freefair.lombok") version "8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.3")
    implementation("org.postgresql:postgresql:42.7.4")
}