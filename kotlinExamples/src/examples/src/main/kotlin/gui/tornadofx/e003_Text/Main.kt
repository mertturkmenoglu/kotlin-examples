package gui.tornadofx.e003_Text

import tornadofx.*

class Application: App(MainView::class)

fun main(args: Array<String>) {
    launch<Application>(args)
}