package fileIO.e009_Walk

import java.io.File

fun main() {
    println("Please enter the path: ")
    val path = readLine() ?: throw Exception()

    File(path).walk().forEach(::println)
}