package kotlinNinetyNine.e003_NthElement

fun main() {
    val result = nth(2, listOf(1, 1, 2, 3, 4, 5))
    println(result)
}

fun <T> nth(n: Int, list: List<T>) = list[n]