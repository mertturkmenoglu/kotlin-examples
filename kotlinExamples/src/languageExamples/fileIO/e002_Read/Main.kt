package languageExamples.fileIO.e002_Read

import java.io.File

fun main() {
    val file = System.getProperty("user.dir") + "/kotlinExamples/text/long.txt"
    val lines = ArrayList<String>()

    File(file).useLines { lines.addAll(it) }
    lines.forEachIndexed { i, line -> println("$i - $line") }
}