package fileIO.e005_Read

import java.io.File

fun main() {
    val fileName = System.getProperty("user.dir") + "/kotlinExamples/text/test.txt"
    val buffReader = File(fileName).bufferedReader()
    val lines = buffReader.readLines()
    lines.forEach(::println)
}