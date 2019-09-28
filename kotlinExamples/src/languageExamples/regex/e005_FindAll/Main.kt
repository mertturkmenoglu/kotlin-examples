package languageExamples.regex.e005_FindAll

fun main() {
    // Starts with 'aa' and has a length of 3
    val regex = "aa.".toRegex()

    @Suppress("SpellCheckingInspection")
    val str = "aagattgcaaaat"

    val patterns = regex.findAll(str, startIndex = 0)

    patterns.forEach { println(it.value) }
}