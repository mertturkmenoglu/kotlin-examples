package languageExamples.collections.general.e002_Filter

fun main() {
    val set = setOf(10, 7, -6, 3, 0)
    val map = mapOf(10 to 0, 7 to 1, -6 to 2, 3 to 3, 0 to 4)
    val list = listOf(10, 7, -6, 3, 0)

    println(set.filter { it > 0 })          // Only positive numbers
    println(map.filter { it.key > 0 })      // Only positive numbers
    println(list.filter { it % 2 == 0 })    // Only even numbers
}