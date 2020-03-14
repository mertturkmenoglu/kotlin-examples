package regex.e002_Regex

@Suppress("SpellCheckingInspection")
fun main() {
    val strings = listOf("aaab", "aaba", "b")
    val reg = "a+b".toRegex()

    for (string in strings) {
        println("$string matches: ${reg.matches(string)}")
    }
}