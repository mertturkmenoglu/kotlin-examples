package languageExamples.collections.general.e004_GroupBy

fun main() {
    val l = listOf("apple", "banana", "mango", "watermelon", "cherries", "grapes", "clementine")

    println(l.groupBy { it.first() }.map { it.key to it.value.size }.toMap())
    println(l.groupingBy { it.first() }.eachCount())
}