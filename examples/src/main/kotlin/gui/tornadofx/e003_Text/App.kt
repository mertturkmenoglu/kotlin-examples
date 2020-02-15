package gui.tornadofx.e003_Text

import javafx.geometry.Pos
import javafx.scene.text.Font
import tornadofx.*

class MainController : Controller() {
    fun getReadability(text: String) = when (TextUtil.readability(text)) {
        in 0.0..6.0 -> "Easy readability"
        in 7.0..12.0 -> "Medium readability"
        else -> "Hard readability"
    }

    fun getTimeToRead(text: String): Int = TextUtil.timeToRead(text).toInt().let {
        if (it > 0) it else 1
    }
}

class MainView : View() {
    val controller: MainController by inject()
    var timeToRead = text("")
    var readability = text("")
    var textarea = textarea("")

    override val root = vbox {
        prefWidth = 960.0
        prefHeight = 640.0
        alignment = Pos.CENTER

        text("Analyse") {
            font = Font(28.0)
            vboxConstraints {
                margin = insets(30.0)
            }
        }

        textarea = textarea {
            selectAll()
            vboxConstraints {
                margin = insets(30.0)
            }
        }

        textarea.isWrapText = true

        hbox {
            vboxConstraints {
                alignment = Pos.BASELINE_CENTER
                marginBottom = 30.0
            }

            label("Time to read") {
                hboxConstraints {
                    marginLeftRight(30.0)
                }
            }

            timeToRead = text("No text")

            label("Readability") {
                hboxConstraints {
                    marginLeftRight(30.0)
                }
            }

            readability = text("No text")
        }

        button("Analyze") {
            action {
                if (textarea.text.isNotEmpty()) {
                    readability.text = controller.getReadability(textarea.text)
                    timeToRead.text = "${controller.getTimeToRead(textarea.text)} minutes"
                }
            }
        }
    }
}