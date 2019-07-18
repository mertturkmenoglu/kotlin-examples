package kotlinNinetyNine.e002_LastButOne

fun main() {
    val result = penultimate(listOf(1, 2, 3, 4, 5, 6, 7))
    println(result)
}

fun <T> penultimate(list: List<T>) = list[list.lastIndex - 1]