package fileIO.e012_Exists

import java.io.File

fun main() {
    println("Enter path: ")
    val path = readLine() ?: throw Exception()

    println(if (File(path).exists()) "File exists" else "File does not exists")
}