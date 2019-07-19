package projectEuler.p010_SummationOfPrimes

import kotlin.math.roundToLong
import kotlin.math.sqrt

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
fun main() {
    val result = primes(upperLimit = 2_000_000.toLong())
    println(result.reduce { acc, l -> acc + l })
}

fun primes(upperLimit: Long) = (0.toLong() until upperLimit).filter { isPrime(it) }

fun isPrime(n: Long): Boolean {
    if (n == 2L || n == 3L) return true
    if (n == 1L || n % 2L == 0L) return false
    return (3L..sqrt(n.toDouble()).roundToLong() step 2).find { n % it == 0L } == null
}