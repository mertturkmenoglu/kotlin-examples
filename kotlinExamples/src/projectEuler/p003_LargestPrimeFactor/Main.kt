package projectEuler.p003_LargestPrimeFactor

import kotlin.math.roundToLong
import kotlin.math.sqrt

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
fun main() {
    val result = findLargestPrimeFactor(num = 600_851_475_143)
    println(result)
}

fun findLargestPrimeFactor(num: Long): Long {
    var number = num
    var max: Long = -1
    var divider: Long = 2

    while (number > 1) {
        if (number % divider == 0.toLong()) {
            max = divider
            number /= divider
        } else {
            divider++
            while (!isPrime(divider))
                divider++
        }
    }

    return max
}

fun isPrime(n: Long) = (n % 2.toLong() != 0.toLong()) && (3..sqrt(n.toDouble()).roundToLong() step 2).find { n % it == 0.toLong() } == null
