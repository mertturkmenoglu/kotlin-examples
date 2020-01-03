package gui.e005_Icon

import java.awt.EventQueue
import javax.swing.*

class IconExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        isVisible = true
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE

        val label1 = JLabel(ImageIcon(System.getProperty("user.dir") + "/kotlinExamples/img/anitkabir_small.jpeg"))
        val label2 = JLabel(ImageIcon(System.getProperty("user.dir") + "/kotlinExamples/img/dog_small.png"))

        createLayout(label1, label2)
    }

    private fun createLayout(vararg args: JComponent) {
        val groupLayout = GroupLayout(contentPane)
        contentPane.layout = groupLayout

        with(groupLayout) {
            autoCreateContainerGaps = true
            autoCreateGaps = true

            setHorizontalGroup(createSequentialGroup().apply { args.forEach { addComponent(it) } })
            setVerticalGroup(createParallelGroup().apply { args.forEach { addComponent(it) } })
        }

        pack()
    }
}

fun main() {
    EventQueue.invokeLater { IconExample("Image") }
}