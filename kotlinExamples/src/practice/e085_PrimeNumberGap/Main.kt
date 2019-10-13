package practice.e085_PrimeNumberGap

import kotlin.math.sqrt

fun main() {
    val gap = 4
    val start = 130
    val end = 200
    val result = primeNumberPairWithGap(start, end, gap)
    println(result)
}

fun primeNumberPairWithGap(start: Int, end: Int, gap: Int): Pair<Int, Int>? {
    return (start..end).filter(Int::isPrime).zipWithNext().first { it.first == it.second + gap }
}

fun Int.isPrime() = when {
    this < 2 -> false
    this == 2 -> true
    this % 2 == 0 -> false
    (3..sqrt(this.toDouble()).toInt()).any { this % it == 0 } -> false
    else -> true
}