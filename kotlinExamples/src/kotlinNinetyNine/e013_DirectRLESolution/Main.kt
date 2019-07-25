package kotlinNinetyNine.e013_DirectRLESolution


fun main() {
    val result = "aaaabccaadeeee".toList().encode()
    println(result)
}

fun <T> List<T>.encode(): ArrayList<Pair<Int, T>> {
    val result = ArrayList<Pair<Int, T>>()
    val pack = ArrayList<MutableList<T>>()

    pack.add(mutableListOf(this.first()))

    for (i in 1 until this.size) {
        if (this[i] == pack.last().first()) {
            pack.last().add(this[i])
        } else {
            pack.add(mutableListOf(this[i]))
        }
    }

    for (pair in pack) {
        result.add(Pair(pair.size, pair.first()))
    }

    return result
}