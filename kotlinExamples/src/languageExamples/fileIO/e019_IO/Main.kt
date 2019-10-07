package languageExamples.fileIO.e019_IO

import java.io.File

fun main() {
    val current = File(".").canonicalPath
    val currDir = System.getProperty("user.dir")

    println(current)
    println(currDir)
}