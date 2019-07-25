package kotlinNinetyNine.e004_LengthOfAList

fun main() {
    val result = listOf(1, 2, 3, 4, 5, 6).listLength()
    println(result)
}

fun <T> List<T>.listLength() = this.size