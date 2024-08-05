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
    implementation("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()
}