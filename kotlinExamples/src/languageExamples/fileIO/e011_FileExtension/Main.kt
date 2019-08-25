package languageExamples.fileIO.e011_FileExtension

import java.io.File

fun main() {
    println("Enter your path: ")
    val path = readLine() ?: throw Exception()

    File(path).walk().forEach {
        if (it.isFile) {
            println("Name: ${it.nameWithoutExtension}")
            println("Extension: ${it.extension}")
            println("========")
        }
    }
}