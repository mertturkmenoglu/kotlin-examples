package kotlinNinetyNine.e024_Lotto

fun main() {
    val n = 3
    val end = 49
    val result = lotto(n, end)
    println(result)
}

fun lotto(n: Int, end: Int): List<Int> = ArrayList<Int>().apply { repeat(n) { add((1..end).random()) } }