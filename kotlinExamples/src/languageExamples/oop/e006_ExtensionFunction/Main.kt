package languageExamples.oop.e006_ExtensionFunction

fun Int.increment(value: Int = 1): Int = this + value

fun main() {
    println(1)
    println(1.increment())
    println(1.increment(3))
}