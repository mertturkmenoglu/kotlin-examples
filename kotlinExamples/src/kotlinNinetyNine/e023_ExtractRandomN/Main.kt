package kotlinNinetyNine.e023_ExtractRandomN

fun main() {
    @Suppress("SpellCheckingInspection")
    val input = "abdcdefgh".toList()
    val result = input.randomSelect(3)
    println(result)
}

fun <T> List<T>.randomSelect(n: Int): List<T> {
    require(n < this.size) { "Invalid number" }
    val result = ArrayList<T>()

    with(toMutableList()) {
        repeat(n) {
            val index = (0 until size).random()
            result.add(this[index])
            removeAt(index)
        }
    }

    return result
}