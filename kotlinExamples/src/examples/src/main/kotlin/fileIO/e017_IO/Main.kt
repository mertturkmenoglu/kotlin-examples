package fileIO.e017_IO

import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main() {
    try {
        val outputPath = input("Output path: ")

        ObjectOutputStream(FileOutputStream(outputPath)).use {
            it.writeObject(arrayOf(1, 2, 3))
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun input(message: String): String {
    println(message)

    return readLine() ?: throw Exception()
}