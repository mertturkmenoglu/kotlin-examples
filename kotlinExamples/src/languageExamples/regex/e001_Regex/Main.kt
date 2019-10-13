package languageExamples.regex.e001_Regex

fun main() {
    val regex = Regex(pattern = "ko")
    val matched = regex.containsMatchIn(input = "kotlin")
    println(matched)

    val regex2 = "^ab$".toRegex()
    val matched2 = regex2.matches(input = "ab")
    println(matched2)

    val regex3 = "^a{2,3}[a,b]$".toRegex()
    val matched3 = regex3.matches(input = "ab")
    println(matched3)

    val matched4 = regex3.matches(input = "aab")
    println(matched4)

    @Suppress("SpellCheckingInspection")
    val matched5 = regex3.matches(input = "aaaa")
    println(matched5)

    val emailRegex = "(\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6})".toRegex()
    println("Print an email address: ")
    val inp = readLine()!!
    println(emailRegex.matches(input = inp))
}