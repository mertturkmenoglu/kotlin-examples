package practice.e019_MaxPrimeInRange

import kotlin.math.sqrt

// Find the biggest prime number in given collection
fun main() {
    val input = listOf(3, 5, 9, 12, 27, 43, 79, 86)
    val result = maxPrime(input)
    print(result)
}

fun maxPrime(c: Collection<Int>) = c.filter(Int::isPrime).max() ?: throw Exception()

fun Int.isPrime() = when {
    this < 2 -> false
    this == 2 -> true
    this % 2 == 0 -> false
    (3 .. sqrt(this.toDouble()).toInt()).any { this % it == 0 } -> false
    else -> true
}