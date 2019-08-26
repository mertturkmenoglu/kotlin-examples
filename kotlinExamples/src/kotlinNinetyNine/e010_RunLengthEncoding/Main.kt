@file:Suppress("SpellCheckingInspection")

package kotlinNinetyNine.e010_RunLengthEncoding

import kotlinNinetyNine.e009_PackConsecutiveDuplicates.pack

fun main() {
    val result = "aaaabccaadeeee".toList().encode()
    println(result)
}

fun List<Char>.encode(): List<Pair<Int, Char>> {
    if (this.isEmpty())
        return emptyList()

    val result = ArrayList<Pair<Int, Char>>()

    this.pack().forEach {
        result.add(Pair(it.size, it.first()))
    }

    return result
}