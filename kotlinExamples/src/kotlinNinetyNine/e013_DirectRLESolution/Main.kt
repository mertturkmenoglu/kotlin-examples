package kotlinNinetyNine.e013_DirectRLESolution


fun main() {
    val result = encode("aaaabccaadeeee".toList())
    println(result)
}

fun encode(list: List<Char>): ArrayList<Pair<Int, Char>> {
    val result = ArrayList<Pair<Int, Char>>()
    val pack = ArrayList<MutableList<Char>>()
    pack.add(mutableListOf(list.first()))

    for (i in 1 until list.size) {
        if (list[i] == pack.last().first()) {
            pack.last().add(list[i])
        } else {
            pack.add(mutableListOf(list[i]))
        }
    }

    for (pair in pack) {
        result.add(Pair(pair.size, pair.first()))
    }

    return result
}