package languageExamples.fileIO.e018_IO

import java.io.File

fun main() {
    try {
        val outputPath = input("Output path: ")

        File(outputPath).writeBytes(byteArrayOf(65, 66, 67))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun input(message: String): String {
    println(message)

    return readLine() ?: throw Exception()
}