package projectEuler.p016_PowerDigitSum

import java.math.BigInteger

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
fun main() {
    val result = digitSum(n = 1_000)
    println(result)
}

fun digitSum(n: Int) = BigInteger("2").pow(n).toString().toList().map { it.toString().toInt() }.reduce { acc, i -> acc + i }