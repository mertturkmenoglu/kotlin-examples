package practice.e053_EveryNegativeNumberOfGroups

import kotlin.random.Random

fun main() {
    val n = 30
    val input = List(n) { Random.nextInt(-10, 30) }
    val k = 5
    val result = firstNegative(input, k)

    input.chunked(k).forEach(::println)
    println("Result: ")
    println(result)
}

fun firstNegative(l: List<Int>, k: Int): List<Int> {
    return l.chunked(k).map { it.first { e -> e < 0 } }
}