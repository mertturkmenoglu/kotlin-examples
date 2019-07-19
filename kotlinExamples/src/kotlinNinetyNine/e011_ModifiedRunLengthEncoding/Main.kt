package kotlinNinetyNine.e011_ModifiedRunLengthEncoding

import kotlinNinetyNine.e009_PackConsecutiveDuplicates.pack

fun main() {
    val result = encode("aaaabccaadeeee".toList())
    println(result)
}

fun encode(list: List<Char>) = ArrayList<Any>().apply {
    pack(list).forEach {
        if (it.size == 1)
            add(it.first())
        else
            add(Pair(it.size, it.first()))
    }
}