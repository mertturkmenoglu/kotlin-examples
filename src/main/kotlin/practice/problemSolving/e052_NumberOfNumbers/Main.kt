package practice.problemSolving.e052_NumberOfNumbers

import kotlin.random.Random

fun main() {
    val n = 6
    val input = List(n) { Random.nextInt(10, 25) }
    val k = 1
    val result = num(input, k)

    println(input)
    println(result)
}

fun num(l: List<Int>, k: Int): Int {
    return l.map { it.toString().split("") }.flatten().count { it == k.toString() }
}