package practice.problemSolving.e101_StringHashFunction

import kotlin.math.pow

fun main() {
    val inputs = listOf("male", "lame", "elma")
    val results = inputs.map { stringHash(it, r = 31, m = 47) }
    println(results)
}

fun stringHash(str: String, r: Int = 31, m: Int = 97): Int {
    return str.map { it - 'a' + 1 }
            .foldIndexed(1F) { i: Int, acc: Float, e: Int -> acc + e * r.toFloat().pow(i) }.toInt().rem(m)
}