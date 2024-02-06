plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.squareup.wire")
}

wire {
    protoLibrary = true
    sourcePath {
        srcDir("src/main/protos")
        include("dino.proto")
        include("planet.proto")
    }
    proto {}
}