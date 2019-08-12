package languageExamples.other.e013_LazyDelegate

fun main() {
    val myString by lazy { println("Access"); "Emily" }

    println(myString)
    println(myString)
}