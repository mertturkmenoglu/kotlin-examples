package practice.e012_WordCounter

fun wordCounter(sentence: String) = sentence.toLowerCase().run { split(" ").groupingBy { it }.eachCount() }

fun main() {
    val words = wordCounter("To be or not to be that is the question")
    println(words)
}