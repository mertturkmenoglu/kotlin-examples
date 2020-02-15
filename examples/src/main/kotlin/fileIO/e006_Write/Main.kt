package fileIO.e006_Write

import java.io.File

fun main() {
    val fileName = System.getProperty("user.dir") + "/kotlinExamples/text/output.txt"
    val file = File(fileName)

    file.printWriter().use {
        it.println("FIRST")
        it.println("SECOND")
    }

    println("FILE OUTPUT IS COMPLETED")
}