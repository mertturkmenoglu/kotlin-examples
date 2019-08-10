package languageExamples.fileIO.e005_Read

import java.io.File

fun main() {
    val fname = System.getProperty("user.dir") + "/kotlinExamples/text/test.txt"
    val buffReader = File(fname).bufferedReader()
    val lines = buffReader.readLines()
    lines.forEach(::println)
}