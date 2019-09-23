package practice.e092_ReverseInPlace

fun main() {
    val input = mutableListOf(1, 2, 3, 4)
    println(input)
    reverseInPlace(input)
    println(input)
}

fun <T> reverseInPlace(l: MutableList<T>) {
    for (i in 0 until l.size / 2) {
        l[i] = l[l.lastIndex - i].also { l[l.lastIndex - i] = l[i] }
    }
}
