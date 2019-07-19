package kotlinNinetyNine.e017_SplitList

fun main() {
    val result = split(3, "abcdefghijk".toList())
    println(result)
}

fun split(n: Int, list: List<Char>) = Pair(list.take(n), list.takeLast(list.size - n))