package projectEuler.p020_FactorialDigitSum

import java.math.BigInteger

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 */
fun main() {
    val result = factorialDigitSum(n = 100)
    println(result)
}

fun factorialDigitSum(n: Int) = factorial(n).toString().map { it.toString().toInt() }.reduce { acc, i -> acc + i }

fun factorial(n: Int): BigInteger = if (n == 1) n.toBigInteger() else factorial(n - 1) * n.toBigInteger()