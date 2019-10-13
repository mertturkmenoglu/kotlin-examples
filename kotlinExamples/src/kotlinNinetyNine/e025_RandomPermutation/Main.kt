package kotlinNinetyNine.e025_RandomPermutation

fun main() {
    @Suppress("SpellCheckingInspection")
    val input = "abcdef".toList()
    val result = input.randomPermutation()
    println(result)
}

fun <T> List<T>.randomPermutation(): List<T> {
    val result = ArrayList<T>()
    val n = size

    with(toMutableList()) {
        repeat(n) {
            val index = (0 until size).random()
            result.add(this[index])
            removeAt(index)
        }
    }

    return result
}