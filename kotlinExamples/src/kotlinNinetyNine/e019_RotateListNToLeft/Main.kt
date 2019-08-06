package kotlinNinetyNine.e019_RotateListNToLeft

fun main() {
    val input = "abcdefghijk".toList()
    val n = -2
    val result = input.rotateLeftN(n)
    println(result)
}

fun <T> List<T>.rotateLeftN(n: Int): List<T> {
    return if (n > 0) {
        drop(n) + take(n)
    } else {
        takeLast(-n) + dropLast(-n)
    }
}