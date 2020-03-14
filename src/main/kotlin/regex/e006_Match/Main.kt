package regex.e006_Match

fun main() {
    val regex = "a([ab]+)cd?".toRegex()

    @Suppress("SpellCheckingInspection")
    val strings = listOf("acd", "aacd", "abcd", "aabcd", "aababcd", "aaaaacd", "aabababcd", "aabcda")

    for (string in strings) {
        println("$string: ${regex.matches(string)}")
    }
}