package languageExamples.regex.e004_Find

fun main() {
    val regex = Regex("ue")
    val ans = regex.find("To be or not to be that is the question", startIndex = 5)

    with (ans ?: throw Exception()) {
        println("Value: $value")
        println("Group values: $groupValues")
        println("Groups: $groups")
        println("Range: $range")
        println("Next: ${next()?.value}")
    }
}