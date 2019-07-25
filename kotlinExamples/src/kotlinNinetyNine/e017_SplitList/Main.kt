package kotlinNinetyNine.e017_SplitList

fun main() {
    val result = "abcdefghijk".toList().splitList(3)
    println(result)
}

fun <T> List<T>.splitList(n: Int) = Pair(this.take(n), this.takeLast(this.size - n))