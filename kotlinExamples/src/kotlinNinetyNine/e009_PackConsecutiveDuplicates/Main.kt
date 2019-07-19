package kotlinNinetyNine.e009_PackConsecutiveDuplicates

fun main() {
    val result = pack("aaaabccaadeeee".toList())
    println(result)
}

fun pack(list: List<Char>) = ArrayList<MutableList<Char>>().apply {
    add(mutableListOf(list.first()))
    list.drop(1).forEach { if (it == last().first()) last().add(it) else add(mutableListOf(it)) }
}

