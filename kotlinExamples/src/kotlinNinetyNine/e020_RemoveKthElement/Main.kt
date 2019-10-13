package kotlinNinetyNine.e020_RemoveKthElement

fun main() {
    @Suppress("SpellCheckingInspection")
    val input = "abcd".toList()
    val n = 1
    val result = input.removeAtN(n)
    println(result)
}

fun <T> List<T>.removeAtN(n: Int): Pair<List<T>, T> {
    require(n >= 0) { "Invalid index" }
    return this.toMutableList().apply { removeAt(n) } to this[n]
}