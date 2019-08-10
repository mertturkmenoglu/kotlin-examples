package languageExamples.fileIO.e004_Read

import java.io.File
import java.nio.charset.Charset

fun main() {
    val name = System.getProperty("user.dir") + "/kotlinExamples/text/test.txt"
    val file = File(name)

    val stream = file.inputStream()
    val content = stream.readBytes().toString(Charset.defaultCharset())
    println(content)
}