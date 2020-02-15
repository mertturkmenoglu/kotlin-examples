package fileIO.e001_Read

import java.io.File

// Do not use with big files
fun main() {
    val file = System.getProperty("user.dir") + "/kotlinExamples/text/test.txt"
    val lines = File(file).readLines()
    lines.forEach(::println)
}