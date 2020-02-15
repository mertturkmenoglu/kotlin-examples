package practice.problemSolving.e012_WordCounter

fun main() {
    val input = "To be or not to be that is the question"
    val result = wordCounter(input)
    println(result)
}

fun wordCounter(sentence: String) = sentence.toLowerCase().split(" ").groupingBy { it }.eachCount()