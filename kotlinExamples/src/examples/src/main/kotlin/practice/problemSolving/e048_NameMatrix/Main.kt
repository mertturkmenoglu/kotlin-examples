package practice.problemSolving.e048_NameMatrix

import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    val input = "emily"
    val result = nameToMatrix(input)
    result.forEach { println(it.asList()) }
}

fun nameToMatrix(input: String): Array<Array<Char>> {
    require(input.isNotEmpty()) { "Name must be at least one letter" }

    val n = ceil(sqrt(input.length.toDouble())).toInt()
    val arr = Array(n) { Array(n) { '.' } }

    input.forEachIndexed { i, e -> arr[i / n][i % n] = e }

    return arr
}