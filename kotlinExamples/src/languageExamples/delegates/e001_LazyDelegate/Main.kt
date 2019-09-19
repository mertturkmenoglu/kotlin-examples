package languageExamples.delegates.e001_LazyDelegate

fun main() {
    val myString by lazy { println("Access"); "Emily" }

    println(myString)
    println(myString)
}