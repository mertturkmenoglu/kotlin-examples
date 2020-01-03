package practice.e081_Josephus

fun main() {
    val n = 100//7
    val k = 1//3
    val result = josephus(n, k)
    println(result)
}

fun josephus(n: Int, k: Int): Int {
    val l = (1..n).toMutableList()
    var index = 0

    while (l.size != 1) {
        index += k - 1
        index %= l.size
        l.removeAt(index)
    }

    return l.single()
}