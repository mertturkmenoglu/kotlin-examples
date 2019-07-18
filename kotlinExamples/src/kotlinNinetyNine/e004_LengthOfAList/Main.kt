package kotlinNinetyNine.e004_LengthOfAList

fun main() {
    val result = length(listOf(1, 2, 3, 4, 5, 6))
    println(result)
}

fun <T> length(list: List<T>) = list.size