package practice.e008_Image

import java.io.FileOutputStream
import java.net.URL

fun main() {
    try {
        val fileName = "Kotlin-logo.png"
        val website = "https://upload.wikimedia.org/wikipedia/commons/b/b5/$fileName"
        println("Downloading file from: $website")

        val url = URL(website)
        val inputStream = url.openStream()
        val outputStream = FileOutputStream(fileName)
        val buffer = Array<Byte>(2048) { 0 }.toByteArray()
        var length = inputStream.read(buffer)

        while (length != -1) {
            outputStream.write(buffer, 0, length)
            length = inputStream.read(buffer)
        }

        inputStream.close()
        outputStream.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
