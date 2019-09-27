package languageExamples.fileIO.e013_RecursiveCopy

import java.io.File
import java.io.IOException

fun main() {
    println("Source path: ")
    val src = readLine() ?: throw Exception()

    println("Destination path: ")
    val dest = readLine() ?: throw Exception()

    try {
        File(src).copyRecursively(File(dest), true)
    } catch (e: IOException) {
        e.printStackTrace()
    }
}