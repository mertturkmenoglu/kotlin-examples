package languageExamples.fileIO.e007_Write

import java.io.File

fun main() {
    val fileName = System.getProperty("user.dir") + "/kotlinExamples/text/output.txt"
    val file = File(fileName)

    file.bufferedWriter().use {
        it.write("1 - BUFFERED WRITER\n")
        it.write("2 - BUFFERED WRITER")
    }

    println("FILE OUTPUT IS COMPLETED")
}