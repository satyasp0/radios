plugins {
    id("java")
}

group = "org.practice"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
    implementation("org.springframework.cloud:spring-cloud-stream:4.0.1")
    implementation("org.projectlombok:lombok:1.18.28")
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    annotationProcessor("org.projectlombok:lombok:1.18.28")

}

tasks.test {
    useJUnitPlatform()
}