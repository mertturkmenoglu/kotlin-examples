package functional.e024_PatternMatching

private fun <T> l(vararg args: T): List<T> = listOf(*args)

fun main() {
    val a = 3
    val b = 5

    val result = getResult(a, b)
    println(result)
}

@Suppress("SameParameterValue")
private fun getResult(a: Int, b: Int): String = when (l(a,b)) {
    l(1, 2) -> "one-two"
    l(3, 4) -> "3-4-5 triangle"
    l(3, 5) -> "three to five"
    else -> "Unknown"
}