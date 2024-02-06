plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.squareup.wire")
}


wire {
    sourcePath {
        srcProject(":module1")
        include("dino.proto")
    }
    kotlin {}
}