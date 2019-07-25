package kotlinNinetyNine.e002_LastButOne

fun main() {
    val result = listOf(1, 2, 3, 4, 5, 6, 7).penultimate()
    println(result)
}

fun <T> List<T>.penultimate() = this[this.lastIndex - 1]