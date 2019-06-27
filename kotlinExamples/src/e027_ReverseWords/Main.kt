package e027_ReverseWords

// Reverse each word of a sentence
fun main() {
    val sentence = "Emily is the best teacher"
    val reverse = reverseWords(sentence)

    println(sentence)
    println(reverse)
}

fun reverseWords(sentence: String): String {
    val tokens = sentence.split(" ")
    return tokens.joinToString(" ", "", "") {
        it.reversed()
    }
}
