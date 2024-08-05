plugins {
    id("java")
}

group = "xyz.zetabot"
version = "0.0.1-CANARY"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("net.dv8tion:JDA:5.0.2") {
        exclude(module = "opus-java")
    }
    implementation("ch.qos.logback:logback-classic:1.5.6")
    implementation("io.github.classgraph:classgraph:4.8.174")
}

tasks.test {
    useJUnitPlatform()
}