package languageExamples.gui.e002_JBUTTON

import java.awt.EventQueue
import javax.swing.*
import kotlin.system.exitProcess

class JButtonExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
        //setSize(512, 512)
        isResizable = true
        setLocationRelativeTo(null)

        val button = JButton("Close Window")
        button.addActionListener { exitProcess(0) }
        createLayout(button)
    }

    private fun createLayout(vararg args: JComponent) {
        val layout = GroupLayout(contentPane)
        contentPane.layout = layout

        layout.autoCreateContainerGaps = true

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(args[0]))
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(args[0]))

        pack()
    }
}

fun main() {
    EventQueue.invokeLater { JButtonExample("JBUTTON EXAMPLE") }
}