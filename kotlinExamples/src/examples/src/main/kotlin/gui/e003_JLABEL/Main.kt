package gui.e003_JLABEL

import java.awt.Color.*
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.GroupLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingConstants.LEADING

class JLabelExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        isVisible = true

        val colors = listOf(black, blue, cyan, darkGray, gray, green, lightGray, magenta,
                orange, pink, red, white, yellow)

        val labels = colors.map {
            JLabel("", null, LEADING).apply {
                minimumSize = Dimension(128, 128)
                background = it
                isOpaque = true
            }
        }

        createLayout(labels)
    }

    private fun createLayout(labels: List<JLabel>) {
        val layout = GroupLayout(contentPane)
        contentPane.layout = layout

        layout.autoCreateContainerGaps = true
        layout.autoCreateGaps = true

        layout.setHorizontalGroup(layout.createParallelGroup().apply {
            addGroup(layout.createSequentialGroup().apply { labels.slice(0..3).forEach { addComponent(it) } })
            addGroup(layout.createSequentialGroup().apply { labels.slice(4..7).forEach { addComponent(it) } })
            addGroup(layout.createSequentialGroup().apply { labels.slice(8..11).forEach { addComponent(it) } })
            addComponent(labels[12])
        })

        layout.setVerticalGroup(layout.createSequentialGroup().apply {
            addGroup(layout.createParallelGroup().apply { labels.slice(0..3).forEach { addComponent(it) } })
            addGroup(layout.createParallelGroup().apply { labels.slice(4..7).forEach { addComponent(it) } })
            addGroup(layout.createParallelGroup().apply { labels.slice(8..11).forEach { addComponent(it) } })
            addComponent(labels[12])
        })

        pack()
    }
}

fun main() {
    EventQueue.invokeLater { JLabelExample("AWT COLORS") }
}