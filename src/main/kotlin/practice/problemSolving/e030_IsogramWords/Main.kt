package practice.problemSolving.e030_IsogramWords

fun main() {
    println(isIsogram("aBcD eFg-rM"))
    println(isIsogram("mM"))

    println(isIsogram2("aBcD eFg-rM"))
    println(isIsogram2("mM"))
}

@Suppress("SpellCheckingInspection")
fun isIsogram(str: String) = str.toLowerCase().filterNot { it == ' ' || it == '-' }.let { it.length == it.toCharArray().distinct().count() }

@Suppress("SpellCheckingInspection")
fun isIsogram2(str: String) = str.toLowerCase().filterNot { it == ' ' || it == '-' }.groupingBy { it }.eachCount().values.find { it != 1 } == null