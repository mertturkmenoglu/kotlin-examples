package practice.imageProcessing.e002_MakeDuller

import javafx.scene.image.Image
import javafx.scene.image.WritableImage
import tornadofx.*

class MainView : View("Make Duller") {
    private val img = Image("/img/nature.jpg")
    private val writableImage = WritableImage(img.pixelReader, img.width.toInt(), img.height.toInt())
    private val w = 400
    private val h = 400

    override val root = borderpane {
        center {
            hbox {
                stackpane {
                    imageview(writableImage).apply {
                        repeat (5) { makeDuller(writableImage) }
                    }

                    hboxConstraints {
                        prefWidth = w.toDouble()
                        prefHeight = h.toDouble()
                    }
                }
            }
        }
    }

    private fun makeDuller(wImg: WritableImage) {
        val pr = wImg.pixelReader
        val pw = wImg.pixelWriter

        for (i in 0 until w) {
            for (j in 0 until h) {
                val color = pr.getColor(i, j)
                pw.setColor(i, j, color.desaturate())
            }
        }
    }
}