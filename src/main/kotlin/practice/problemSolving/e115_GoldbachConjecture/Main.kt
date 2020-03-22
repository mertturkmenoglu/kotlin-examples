package practice.problemSolving.e115_GoldbachConjecture

import kotlin.math.sqrt

// Conjecture: Every even integer that is greater than two
// is the sum of two prime numbers
fun main() {
    val start = 5
    val end = 10
    val result = gConjecture(start, end)

    println(result)
}

fun gConjecture(start: Int, end: Int): List<Pair<Int, Int>> {
    require(start > 2) { "Start number must be greater than two" }
    require(end > 2) { "End number must be greater than two" }
    require(end > start) { "End number must be greater than start number" }

    val evenNumbers = (start .. end).filter { it % 2 == 0 }
    val primes = primeNumbers()
            .takeWhile { it < evenNumbers.last() }
            .dropWhile { it > evenNumbers.first() }
            .toList()

    return evenNumbers.map { even ->
        primes.takeWhile { it < even }.run {
            mapNotNull { it.takeIf { this.contains(even - it) } }.first().let {
                it to (even-it)
            }
        }
    }
}

private fun primeNumbers() = sequence {
    var n = 2

    while (true) {
        if (isPrime(n)) {
            yield(n)
        }
        n++
    }
}

private fun isPrime(n: Int): Boolean = when {
    n == 2 -> true
    n % 2 == 0 -> false
    (3..sqrt(n.toDouble()).toInt()).any { n % it == 0 } -> false
    else -> true
}