package dsl.e001_InfixFunction

fun main() {
    "Emily" shouldBeEqual "emily".capitalize()
    10 shouldBeEqual 5

    val name = "Emily"
    val surname = " Smith"
    println(name concat surname)
}