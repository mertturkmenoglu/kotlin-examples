package serialization.e001_Serialization

import Resources
import serialization.deleteFile
import serialization.serialize

fun main() {
    val o = Info(35, "Emily")
    val path = "${Resources.path}/file"

    serialize(o, path)

    println("Would you like to delete the file?[y/N]")
    val inp = readLine() ?: throw Exception()

    if (inp[0] in listOf('y', 'Y')) {
        deleteFile(path)
    }
}