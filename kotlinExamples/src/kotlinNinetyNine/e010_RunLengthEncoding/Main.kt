package kotlinNinetyNine.e010_RunLengthEncoding

import kotlinNinetyNine.e009_PackConsecutiveDuplicates.pack

fun main() {
    val result = encode("aaaabccaadeeee".toList())
    println(result)
}

fun encode(list: List<Char>) = ArrayList<Pair<Int, Char>>().apply {
    pack(list).forEach {
        add(Pair(it.size, it.first()))
    }
}