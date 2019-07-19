package projectEuler.p007_10001stPrime

import kotlin.math.roundToLong
import kotlin.math.sqrt

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
fun main() {
    val result = findPrime(n = 10_001)
    println(result)
}

fun findPrime(n: Int): Long {
    var i = 0
    var current: Long = 1
    var max: Long = -1

    while (i < n) {
        if (isPrime(current)) {
            max = current
            i++
        }
        current++
    }

    return max
}

fun isPrime(n: Long) = (n % 2.toLong() != 0.toLong()) && (3..sqrt(n.toDouble()).roundToLong() step 2).find { n % it == 0.toLong() } == null