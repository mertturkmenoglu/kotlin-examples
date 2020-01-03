package gui.e006_JMenuBar

import java.awt.Dimension
import java.awt.EventQueue
import java.awt.event.KeyEvent
import javax.swing.*
import kotlin.system.exitProcess

class JMenuBarExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
        minimumSize = Dimension(512, 512)
        setLocationRelativeTo(null)

        createMenuBar()
    }

    private fun createMenuBar() {
        val menuBar = JMenuBar()
        val menuIcon = ImageIcon(System.getProperty("user.dir") + "/kotlinExamples/img/dog_small.png")

        val file = JMenu("File")
        file.mnemonic = KeyEvent.VK_F

        val menuItem = JMenuItem("Exit", menuIcon)
        menuItem.mnemonic = KeyEvent.VK_F4
        menuItem.toolTipText = "Exit"
        menuItem.addActionListener { exitProcess(0) }

        file.add(menuItem)
        menuBar.add(file)

        jMenuBar = menuBar
    }
}

fun main() {
    EventQueue.invokeLater { JMenuBarExample("Menu Example") }
}