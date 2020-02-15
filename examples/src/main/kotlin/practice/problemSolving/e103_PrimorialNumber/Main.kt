package practice.problemSolving.e103_PrimorialNumber

import kotlin.math.sqrt

// Code Wars: https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124

fun main() {
    val n = 5
    val result = primorial(n = n)
    println(result)
}

fun primorial(n: Int): Int {
    return getPrimes().take(n).fold(1) { acc, i -> acc * i }
}

private fun getPrimes() = sequence {
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