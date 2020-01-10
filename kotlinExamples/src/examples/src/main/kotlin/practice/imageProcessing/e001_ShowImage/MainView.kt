package practice.imageProcessing.e001_ShowImage

import javafx.scene.image.Image
import javafx.scene.image.WritableImage
import tornadofx.*

class MainView : View("Kotlin Image Processing") {
    private val img = Image("/img/nature.jpg")
    private val w = img.width.toInt()
    private val h = img.height.toInt()
    private val writableImage = WritableImage(img.pixelReader, w, h)

    override val root = borderpane {
        center {
            hbox {
                stackpane {
                    imageview(writableImage)
                    hboxConstraints {
                        prefWidth = 400.0
                        prefHeight = 400.0
                    }
                }
            }
        }
    }
}