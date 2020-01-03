package regex.e002_Regex

@Suppress("SpellCheckingInspection")
fun main() {
    val str1 = "aaab"
    val str2 = "aaba"
    val str3 = "b"

    val reg = "a+b".toRegex()
    println("Matches: ${reg.matches(str1)}")
    println("Matches: ${reg.matches(str2)}")
    println("Matches: ${reg.matches(str3)}")
}