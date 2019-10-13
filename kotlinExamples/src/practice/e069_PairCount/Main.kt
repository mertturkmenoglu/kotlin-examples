package practice.e069_PairCount

fun main() {
    val input = listOf(1, 1, 2, 1, 2, 3, 1, 1, 2, 3, 1)
    val result = pairCount(input)
    println(result)
}

fun <T> pairCount(l: List<T>) = l.groupingBy { it }.eachCount().values.fold(0) { acc, i -> acc + i / 2 }
