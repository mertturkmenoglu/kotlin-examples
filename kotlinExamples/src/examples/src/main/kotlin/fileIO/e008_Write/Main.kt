package fileIO.e008_Write

import java.io.File

fun main() {
    val fileName = System.getProperty("user.dir") + "/kotlinExamples/text/output.txt"
    val file = File(fileName)

    file.writeText("1 - WRITE TEXT")

    println("FILE OUTPUT IS COMPLETED")
}