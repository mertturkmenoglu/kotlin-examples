package practice.e043_Outlier

fun main() {
    val input = listOf(2, 4, 0, 100, 4, 11, 2602, 36)
    val result = findOutlier(input)
    println(result)
}

fun findOutlier(l: List<Int>): Int {
    require(l.size >= 3) { "Invalid number of integers" }
    return l.find { it % 2 == l.take(2).all { n -> n % 2 == 0 }.toInt() } ?: throw Exception()
}

fun Boolean.toInt() = if (this) 1 else 0