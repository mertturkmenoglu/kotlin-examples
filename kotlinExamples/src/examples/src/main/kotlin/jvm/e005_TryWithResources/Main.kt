package jvm.e005_TryWithResources

import java.io.FileInputStream
import java.nio.file.Paths

fun main() {
    // Try-with-Resources in Java 7.
    // use() in Kotlin

    val path = Paths.get(Resources.path, "text", "test.txt").toString()
    FileInputStream(path).use {
        var data = it.read()

        while (data != -1) {
            print(data.toChar())
            data = it.read()
        }
    }
}