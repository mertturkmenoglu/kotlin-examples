package languageExamples.fileIO.e010_Copy

import java.io.File
val path = System.getProperty("user.dir") + "/kotlinExamples/src/languageExamples/fileIO/e010_Copy"
fun main() {
    println("Content of the first file: ")
    File("$path/first.txt").forEachLine(action = ::println)
    println("========")

    println("Content of the second file: ")
    File("$path/second.txt").forEachLine(action = ::println)
    println("========")

    println("Now copy first file's content to second file")
    File("$path/first.txt").copyTo(File("$path/second.txt"), overwrite = true)
    println("========")

    println("Content of the first file: ")
    File("$path/first.txt").forEachLine(action = ::println)
    println("========")

    println("Content of the second file: ")
    File("$path/second.txt").forEachLine(action = ::println)

    // Now delete content of the second file
    // For other times
    File("$path/second.txt").writeText("")
}