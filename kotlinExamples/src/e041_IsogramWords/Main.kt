package e041_IsogramWords

fun main() {
    println(isIsogram("aBcD eFg-rM"))
    println(isIsogram("mM"))
}

fun isIsogram(str: String) = str.toLowerCase().filterNot { it == ' ' || it == '-'}.let { it.length == it.toCharArray().distinct().count() }