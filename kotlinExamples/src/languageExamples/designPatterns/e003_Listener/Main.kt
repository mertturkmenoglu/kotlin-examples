package languageExamples.designPatterns.e003_Listener

import kotlin.properties.Delegates

interface TextChangeListener {
    fun onTextChange(newText: String)
}

class TextView {
    var listener: TextChangeListener? = null
    var text: String by Delegates.observable("") { _, _, newValue ->
        listener?.onTextChange(newValue)
    }
}

fun main() {
    val textView = TextView().apply {
        listener = object : TextChangeListener {
            override fun onTextChange(newText: String) = println("New text: $newText")
        }
    }

    textView.text = "First"
    textView.text = "Second"
}