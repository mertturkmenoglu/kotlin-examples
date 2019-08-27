package practice.e027_ReverseWords

// Reverse each word of a sentence
fun main() {
    val sentence = "Emily is the best teacher"
    val reverse = reverseWords(sentence)

    println(sentence)
    println(reverse)
}

fun reverseWords(sentence: String) = sentence.split(" ").joinToString(" ") { it.reversed() }

