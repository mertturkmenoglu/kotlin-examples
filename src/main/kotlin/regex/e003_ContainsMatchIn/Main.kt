package regex.e003_ContainsMatchIn

fun main() {
    // Any string starts with a
    val regex = "^a".toRegex()
    val strings = listOf("a", "ab", "aaa", "emily", "", "abraham")

    for (string in strings) {
        println("$string containsMatchIn: ${regex.containsMatchIn(string)}")
    }
}