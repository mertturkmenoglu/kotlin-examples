package languageExamples.gui.e004_JCHECKBOX

import java.awt.Dimension
import java.awt.EventQueue
import java.awt.event.ItemEvent
import javax.swing.*

class JCheckBoxExample(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        minimumSize = Dimension(256, 256)

        val checkBox = JCheckBox("Select me", false)
        checkBox.addItemListener {
            val selected = it.stateChange
            if (selected == ItemEvent.SELECTED) {
                setTitle("Emily")
            } else {
                setTitle(title)
            }
        }

        createLayout(checkBox)
    }

    private fun createLayout(vararg args: JComponent) {
        val groupLayout = GroupLayout(contentPane)

        with (groupLayout) {
            contentPane.layout = this
            autoCreateContainerGaps = true

            setHorizontalGroup(createSequentialGroup().addComponent(args.first()))
            setVerticalGroup(createSequentialGroup().addComponent(args.first()))
        }

        pack()
    }
}

fun main() {
    EventQueue.invokeLater { JCheckBoxExample("CheckBox") }
}