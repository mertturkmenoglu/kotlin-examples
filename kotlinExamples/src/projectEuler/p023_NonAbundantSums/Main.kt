package projectEuler.p023_NonAbundantSums

/**
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be
 * 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n
 * and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 * By mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers.
 * However, this upper limit cannot be reduced any further by analysis
 * even though it is known that the greatest number that cannot be expressed
 * as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written
 * as the sum of two abundant numbers.
 */
fun main() {
    val result = sumOfAll(1, 28_123)
    println(result)

}

fun sumOfAll(downLimit: Int, upperLimit: Int): Long {
    val cannotWritten = ArrayList<Int>()
    val abNumbers = ArrayList<Int>()
    for (i in 12..28_123) {
        if (isAbundant(i)) abNumbers.add(i)
    }
    for (i in downLimit..upperLimit) {
        if (!canBeWritten(i, abNumbers)) cannotWritten.add(i)
    }

    return cannotWritten.map { it.toLong() }.reduce { acc, l -> acc + l }
}

fun canBeWritten(n: Int, abNumbers: ArrayList<Int>): Boolean {
    for (i in 0 until abNumbers.size) {
        for (j in i until abNumbers.size) {
            if (abNumbers[i] + abNumbers[j] == n) return true
        }
    }

    return false
}

fun isAbundant(n: Int): Boolean {
    var result = 0
    getDivisors(n).forEach { result += it }
    return n < result
}

fun getDivisors(n: Int): ArrayList<Int> {
    val divisors = ArrayList<Int>()

    for (i in 1 until n) {
        if (n % i == 0) divisors.add(i)
    }

    return divisors
}