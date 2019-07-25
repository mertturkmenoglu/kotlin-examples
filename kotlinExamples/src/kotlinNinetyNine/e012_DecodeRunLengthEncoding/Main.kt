package kotlinNinetyNine.e012_DecodeRunLengthEncoding

import kotlinNinetyNine.e010_RunLengthEncoding.encode

fun main() {
    val result = "aaaabccaadeeee".toList().encode().decode()
    println(result)
}

fun <T> List<Pair<Int, T>>.decode(): List<T> {
    val result = ArrayList<T>()

    this.forEach {
        repeat(it.first) { _ ->
            result.add(it.second)
        }
    }

    return result
}