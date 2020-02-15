package gui.tornadofx.e003_Text

// Original project: https://superkotlin.com/kotlin-mega-tutorial/#real-program
object TextUtil {
    fun timeToRead(text: String): Double = text.count { it.isLetterOrDigit() }.toDouble() / 987

    fun readability(text: String): Double {
        val words = findWordCount(text).toDouble()
        val sentences = findSentenceCount(text).toDouble()
        val letterCount = text.count { it.isLetterOrDigit() }.toDouble()

        val avgLettersPerHundredWords = letterCount / words * 100
        val avgSentencesPerHundredWords = sentences / words * 100

        val grade = 0.0588 * avgLettersPerHundredWords - 0.296 * avgSentencesPerHundredWords - 15.8
        return if (grade > 0) grade else 0.0
    }

    private fun findSentenceCount(text: String): Int {
        var index = 0
        var sentences = 0

        while(index < text.length) {
            index = text.indexOf('.', index)

            if (index == -1)
                index = text.length

            when {
                index + 1 >= text.length -> sentences++
                index + 1 < text.length && index > 2 -> {
                    if (!text[index - 2].isWhitespace() && text[index - 2] != '.' && text[index + 1].isWhitespace())
                        sentences++
                }
            }

            index++
        }

        return sentences
    }

    private fun findWordCount(text: String): Int = text.split(" ").count()
}