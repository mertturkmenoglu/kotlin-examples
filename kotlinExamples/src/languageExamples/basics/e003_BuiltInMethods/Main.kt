package languageExamples.basics.e003_BuiltInMethods

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    if (arr.any { it == 6 }) {
        println("Element found")
    } else {
        println("Element not found")
    }

    val max = arr.max()
    val min = arr.min()

    println("$max and $min")
    val string = "Emily is the best!"
    val frequencies = string.groupingBy { it }.eachCount()
    println(frequencies)
}