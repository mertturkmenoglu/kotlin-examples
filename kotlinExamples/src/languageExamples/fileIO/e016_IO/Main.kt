package languageExamples.fileIO.e016_IO

import java.io.FileInputStream
import java.io.ObjectInputStream

@Suppress("SpellCheckingInspection", "UNCHECKED_CAST")
fun main() {
    try {
        val inputPath = input("Input path: ")

        val ois = ObjectInputStream(FileInputStream(inputPath))
        val obj = ois.readObject()
        ois.close()

        if (obj is Array<*>) {
            val chars = obj as Array<Char>
            chars.forEach(::println)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun input(message: String): String {
    println(message)

    return readLine() ?: throw Exception()
}