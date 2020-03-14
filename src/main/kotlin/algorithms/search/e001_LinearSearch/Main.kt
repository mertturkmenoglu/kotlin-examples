package algorithms.search.e001_LinearSearch

fun main() {
    val list = listOf(9, 2, 1, 3, 0, 4, 8, 7, 6, 5)
    val e = list.random()
    val index = linearSearch(list = list, e = e)

    println(e)
    println(list)
    println(index)
}

fun <T : Comparable<T>> linearSearch(list: List<T?>, e: T?): Int {
    for ((index, element) in list.withIndex()) {
        if (element == e) return index
    }

    return -1
}