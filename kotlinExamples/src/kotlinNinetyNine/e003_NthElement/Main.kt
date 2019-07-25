package kotlinNinetyNine.e003_NthElement

fun main() {
    val result = listOf(1, 1, 2, 3, 4, 5).nth(2)
    println(result)
}

fun <T> List<T>.nth(n: Int) = this[n]