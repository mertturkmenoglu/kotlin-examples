package languageExamples.regex.e006_Match

fun main() {
    val regex = "a([ab]+)cd?".toRegex()

    @Suppress("SpellCheckingInspection")
    val strings = listOf("acd", "aacd", "abcd", "aabcd", "aababcd", "aaaaacd", "aabababcd", "aabcda")

    strings.forEach { println("$it: ${regex.matches(it)}") }
}