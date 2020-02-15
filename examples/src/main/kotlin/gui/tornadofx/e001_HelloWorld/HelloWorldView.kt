package gui.tornadofx.e001_HelloWorld

import tornadofx.*
import tornadofx.View
import tornadofx.hbox

class HelloWorldView: View() {
    override val root = hbox {
        button("Hello World") {
            action {
                println("Button pressed")
            }
        }
    }
}