package kotlinNinetyNine.e016_DropEveryNthElement

fun main() {
    val result = drop(3, "abcdefghijk".toList())
    println(result)
}

fun drop(n: Int, list: List<Char>): List<Char> {
    val result = ArrayList<Char>()

    for (i in 1 .. list.size) {
        if (i % n != 0) {
            result.add(list[i - 1])
        }
    }

    return result
}