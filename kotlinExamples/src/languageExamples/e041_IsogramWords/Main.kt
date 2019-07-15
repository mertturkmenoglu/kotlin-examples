package languageExamples.e041_IsogramWords

fun main() {
    println(isIsogram("aBcD eFg-rM"))
    println(isIsogram("mM"))

    println(isIsogram2("aBcD eFg-rM"))
    println(isIsogram2("mM"))
}

fun isIsogram(str: String) = str.toLowerCase().filterNot { it == ' ' || it == '-' }.let { it.length == it.toCharArray().distinct().count() }

fun isIsogram2(str: String) = str.toLowerCase().filterNot { it == ' ' || it == '-' }.groupingBy { it }.eachCount().values.find { it != 1 } == null