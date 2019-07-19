package projectEuler.p005_SmallestMultiple

import kotlin.math.max
import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * 2520 is the smallest number that can be divided
 * by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 */
fun main() {
    val result = smallestDivisible(range = 1..20)
    println(result)
}

fun smallestDivisible(range: IntRange): Long {
    val factors = mutableMapOf(Pair(1, 1))

    for (number in range.filter { it != 1 }) {
        val numberFactors = findPrimeFactors(number)
        for (f in numberFactors) {
            factors[f.key] = if (factors.containsKey(f.key)) max(factors[f.key]!!, f.value) else f.value
        }
    }

    var result: Long = 1
    factors.forEach { f -> repeat(f.value) { result *= f.key } }

    return result
}

fun findPrimeFactors(num: Int): Map<Int, Int> {
    var number = num
    val factors = ArrayList<Int>()
    var divider = 2

    while (number > 1) {
        if (number % divider == 0) {
            factors += divider
            number /= divider
        } else {
            divider++
            while (!isPrime(divider))
                divider++
        }
    }

    return factors.groupingBy { it }.eachCount()
}

fun isPrime(n: Int) = (n % 2 != 0) && (3..sqrt(n.toDouble()).roundToInt() step 2).find { n % it == 0 } == null