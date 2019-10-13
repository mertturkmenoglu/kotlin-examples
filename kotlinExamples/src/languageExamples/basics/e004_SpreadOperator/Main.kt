package languageExamples.basics.e004_SpreadOperator

fun main() {
    printElements(1, 2, 3)
    val arr = arrayOf(4, 5, 6)
    printElements(*arr)
}

fun <T> printElements(vararg elements: T) {
    for (e in elements) {
        println(e)
    }
}