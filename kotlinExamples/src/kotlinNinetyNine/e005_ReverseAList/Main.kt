package kotlinNinetyNine.e005_ReverseAList

fun main() {
    val result = reverse(listOf(1, 2, 3, 4, 5))
    println(result)
}

fun <T> reverse(list: List<T>) = list.reversed()