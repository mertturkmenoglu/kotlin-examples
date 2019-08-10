package languageExamples.gui.e001_JFRAME

import java.awt.EventQueue
import javax.swing.JFrame

class JFrameExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(256, 256)
        setLocationRelativeTo(null)
    }
}

fun main() {
    EventQueue.invokeLater { JFrameExample("JFRAME EXAMPLE") }
}