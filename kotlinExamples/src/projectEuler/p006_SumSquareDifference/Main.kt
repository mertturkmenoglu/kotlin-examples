package projectEuler.p006_SumSquareDifference

/**
 * The sum of the squares of the first ten natural numbers is = 385
 * The square of the sum of the first ten natural numbers is = 3025
 * Hence the difference between the sum of the squares of
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
fun main() {
    val result = sumSquareDifference(begin = 1, end = 100)
    println(result)
}

fun sumSquareDifference(begin: Int, end: Int): Long {
    val sumOfTheSquares: Long = (begin.toLong()..end.toLong()).reduce { acc, l -> acc + l * l}
    val squareOfTheSum: Long = (begin.toLong()..end.toLong()).reduce { acc, l -> acc + l }.let { it * it }
    return squareOfTheSum - sumOfTheSquares
}