package practice.e007_Image

import javax.swing.JFrame
import java.awt.Graphics
import java.awt.image.BufferedImage
import java.awt.Image
import javax.swing.JPanel


class Test : JPanel() {
    override fun paint(g: Graphics) {
        val img = createImageWithText()
        g.drawImage(img, 20, 20, this)
    }

    private fun createImageWithText(): Image {
        val bufferedImage = BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB)
        val g = bufferedImage.graphics

        g.drawString("Emily", 20, 20)
        g.drawString("Diana", 20, 40)
        g.drawString("Barbara", 20, 60)
        g.drawString("Selina", 20, 80)
        g.drawString("Carol", 20, 100)

        return bufferedImage
    }
}


fun main() {
    val frame = JFrame()
    frame.contentPane.add(Test())

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(500, 500)
    frame.isVisible = true
}