package languageExamples.fileIO.e015_IO

import java.io.FileInputStream
import java.io.FileOutputStream

@Suppress("SpellCheckingInspection")
fun main() {
    try {
        val inputPath = input("Input path: ")
        val outputPath = input("Output path: ")

        val istream = FileInputStream(inputPath)
        val ostream = FileOutputStream(outputPath)

        val buffer = ByteArray(1024) { 0 }
        var len: Int

        do {
            len = istream.read(buffer)

            if (len != -1) {
                ostream.write(buffer, 0, len)
            }
        } while (len != -1)

        istream.close()
        ostream.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun input(message: String): String {
    println(message)

    return readLine() ?: throw Exception()
}