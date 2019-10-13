package practice.e098_BogoSort

import kotlin.random.Random

fun main() {
    val input = mutableListOf<Int>().apply { repeat(Random.nextInt(3, 5)) { add(Random.nextInt(-50, 50)) } }
    val result = bogoSort(input)

    println(input)
    println(result)
}

tailrec fun bogoSort(l: List<Int>): List<Int> = if (isSorted(l)) l else bogoSort(l.shuffled())

fun isSorted(l: List<Int>) = l.zipWithNext().all { it.first < it.second }