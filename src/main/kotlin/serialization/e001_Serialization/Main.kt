package serialization.e001_Serialization

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectOutputStream

fun main() {
    val o = Info(35, "Emily")
    val path = "${Resources.path}/file"

    try {
        val fos = FileOutputStream(path)
        val oos = ObjectOutputStream(fos)

        oos.writeObject(o)
        oos.close()
        fos.close()

        println("Serialization completed")
    } catch (e: IOException) {
        e.printStackTrace()
    }

    println("Would you like to delete the file?[y/N]")
    val inp = readLine() ?: throw Exception()

    if (inp[0] in listOf('y', 'Y')) {
        try {
            if (File(path).delete()) {
                println("Serialized file deleted")
            } else {
                println("Delete operation failed")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}