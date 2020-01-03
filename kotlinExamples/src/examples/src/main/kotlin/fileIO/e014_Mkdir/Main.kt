package fileIO.e014_Mkdir

import java.io.File

fun main() {
    val path = input("Enter your path: ")

    with(File(path)) {
        if (!exists()) {
            mkdir()
        }
    }
}

fun input(message: String): String {
    println(message)

    return readLine() ?: throw Exception()
}