package kotlinNinetyNine.e016_DropEveryNthElement

fun main() {
    val result = "abcdefghijk".toList().dropEveryN(3)
    println(result)
}

fun <T> List<T>.dropEveryN(n: Int): List<T> {
    val result = ArrayList<T>()

    for (i in 1 .. this.size) {
        if (i % n != 0) {
            result.add(this[i - 1])
        }
    }

    return result
}