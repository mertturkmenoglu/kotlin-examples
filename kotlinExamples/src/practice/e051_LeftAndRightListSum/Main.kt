package practice.e051_LeftAndRightListSum

import kotlin.random.Random

fun main() {
    val n = 6
    val input = List(n) { Random.nextInt(3, 15) }
    val result = leftAndRightSumProduct(input)

    println(input)
    println(result)
}

fun leftAndRightSumProduct(input: List<Int>): Int {
    return input.chunked(input.size / 2).map { it.reduce { acc, i -> acc + i } }.fold(1) { acc, i -> acc * i}
}