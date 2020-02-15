package practice.problemSolving.e079_kPrimes

import kotlin.math.sqrt

fun main() {
    val k = 5
    val start = 500
    val end = 600
    val result = kPrimes(k, start, end)
    println(result)
}

fun kPrimes(k: Int, start: Int, end: Int) = (start..end).filter { kPrimeCount(it) == k }

fun kPrimeCount(n: Int): Int {
    return decompose(n).values.reduce { acc, i -> acc + i }
}

fun decompose(number: Int): Map<Int, Int> {
    require(number > 1)

    val m = getPrimes().takeWhile { it <= number }.associateWith { 0 }.toMutableMap()
    var n = number

    for (e in m) {
        while (n % e.key == 0 && n > 1) {
            e.setValue(e.value + 1)
            n /= e.key
        }
    }

    return m.filter { it.value != 0 }
}

fun getPrimes() = sequence {
    var n = 2
    while (true) {
        if (isPrime(n))
            yield(n)
        n++
    }
}

fun isPrime(n: Int) = when {
    n == 2 -> true
    n % 2 == 0 -> false
    (3..sqrt(n.toDouble()).toInt()).any { n % it == 0 } -> false
    else -> true
}