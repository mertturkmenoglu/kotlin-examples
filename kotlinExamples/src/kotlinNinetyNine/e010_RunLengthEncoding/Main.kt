@file:Suppress("SpellCheckingInspection")

package kotlinNinetyNine.e010_RunLengthEncoding

import kotlinNinetyNine.e009_PackConsecutiveDuplicates.pack

fun main() {
    val result = "aaaabccaadeeee".toList().encode()
    println(result)
}

fun <T> List<T>.encode(): List<Pair<Int, T>> {
    val result = ArrayList<Pair<Int, T>>()

    this.pack().forEach {
        result.add(Pair(it.size, it.first()))
    }

    return result
}