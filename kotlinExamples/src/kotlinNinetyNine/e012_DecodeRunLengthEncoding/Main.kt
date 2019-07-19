package kotlinNinetyNine.e012_DecodeRunLengthEncoding

import kotlinNinetyNine.e010_RunLengthEncoding.encode

fun main() {
    val result = decode(encode("aaaabccaadeeee".toList()))
    println(result)
}

fun decode(code: ArrayList<Pair<Int, Char>>) = ArrayList<Char>().apply {
    code.forEach { repeat(it.first) { _ -> add(it.second) } }
}
