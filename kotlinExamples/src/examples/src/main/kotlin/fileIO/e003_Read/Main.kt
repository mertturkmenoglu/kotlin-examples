package fileIO.e003_Read

import java.io.File

// Do not use with big files
fun main() {
    val file = System.getProperty("user.dir") + "/kotlinExamples/text/test.txt"
    val allContent = File(file).readText()  // Read entire content as a single string
    println(allContent)
}