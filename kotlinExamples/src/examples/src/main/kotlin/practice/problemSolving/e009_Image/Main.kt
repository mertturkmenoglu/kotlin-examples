package practice.problemSolving.e009_Image

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class Pixel {
    private lateinit var image: BufferedImage
    private var width: Int = 0
    private var height: Int = 0

    init {
        try {
            val path = "${System.getProperty("user.dir")}/kotlinExamples/src/examples/build/resources/main/img/anitkabir.jpeg"
            val input = File(path)

            image = ImageIO.read(input)
            width = image.width
            height = image.height

            var count = 0

            for (i in 0 until height) {
                for (j in 0 until width) {
                    count++
                    val c = Color(image.getRGB(j, i))
                    println("S.No: $count\tRed: ${c.red}\tGreen: ${c.green}\tBlue: ${c.blue}")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}


fun main() {
    Pixel()
}