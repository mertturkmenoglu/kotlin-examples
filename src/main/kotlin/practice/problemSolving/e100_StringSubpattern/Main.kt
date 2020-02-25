@file:Suppress("SpellCheckingInspection")

package practice.problemSolving.e100_StringSubpattern

fun main() {
    val inputs = listOf("a", "aaaa", "abcd", "abababab", "ababababa")
    val results = inputs.map(::hasSubpattern)
    println(results)
}

fun hasSubpattern(str: String): Boolean {
    require(str.isNotEmpty()) { "Input string can not be empty" }

    for (i in 1 until str.length) {
        if (mutableListOf("").apply { repeat(str.length / i) { add(str.take(i)) } }.joinToString("") == str)
            return true
    }

    return false
}