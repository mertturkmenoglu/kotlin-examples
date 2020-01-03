package practice.e015_Anagram.gui

import practice.e015_Anagram.isAnagram
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.*

class AnagramUI(title: String) : JFrame() {
    init {
        initUI(title)
    }

    private fun initUI(title: String) {
        setTitle(title)
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
        minimumSize = Dimension(256, 256)
        setLocationRelativeTo(null)

        val text1 = JLabel("Word").apply { setBounds(50, 20, 156, 20) }
        val word = JTextField().apply { setBounds(50, 40, 156, 20) }
        val text2 = JLabel("Other Word").apply { setBounds(50, 60, 156, 20) }
        val otherWord = JTextField().apply { setBounds(50, 80, 156, 20) }
        val button = JButton("Check").apply { setBounds(50, 120, 156, 20) }

        button.addActionListener {
            val msg = when {
                word.text == "" || otherWord.text == "" -> "False"
                isAnagram(word.text, otherWord.text) -> "True"
                else -> "False"
            }
            JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE)

            word.text = ""
            otherWord.text = ""
        }

        createLayout(text1, word, text2, otherWord, button)
    }

    private fun createLayout(vararg args: JComponent) {
        val layout = GroupLayout(contentPane)
        contentPane.layout = layout

        layout.autoCreateGaps = true
        layout.autoCreateContainerGaps = true

        args.forEach { add(it) }

        pack()
    }
}

fun main() {
    EventQueue.invokeLater { AnagramUI("Anagram") }
}