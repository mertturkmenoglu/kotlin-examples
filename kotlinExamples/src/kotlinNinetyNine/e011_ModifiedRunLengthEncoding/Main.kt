package kotlinNinetyNine.e011_ModifiedRunLengthEncoding

import kotlinNinetyNine.e009_PackConsecutiveDuplicates.pack

fun main() {
    val result = "aaaabccaadeeee".toList().encode()
    println(result)
}

fun <T> List<T>.encode(): ArrayList<Any> {
    val result = ArrayList<Any>()

    this.pack().forEach {
        if (it.size == 1)
            result.add(it.first().toString())
        else
            result.add(Pair(it.size, it.first()))
    }

    return result
}