package practice.problemSolving.e010_Image

import java.awt.Graphics
import java.io.File
import javax.imageio.ImageIO
import javax.swing.JFrame
import javax.swing.JPanel

class ImagePanel : JPanel() {
    override fun paint(g: Graphics) {
        @Suppress("SpellCheckingInspection")
        val img = ImageIO.read(File("${System.getProperty("user.dir")}/kotlinExamples/src/examples/build/resources/main/img/anitkabir.jpeg"))
        g.drawImage(img, (1920 - img.width) / 2, (1080 - img.height) / 2, this)
    }
}


fun main() {
    val frame = JFrame()
    val imagePanel = ImagePanel()
    frame.contentPane.add(imagePanel)

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(1920, 1080)
    frame.isVisible = true
}