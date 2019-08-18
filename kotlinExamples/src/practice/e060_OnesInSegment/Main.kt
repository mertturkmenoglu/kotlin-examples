package practice.e060_OnesInSegment

fun main() {
    val begin = 4
    val end = 7
    val result = countOnes(begin, end)
    println(result)
}

fun countOnes(begin: Int, end: Int): Long {
    assert(begin >= 1)
    var result = 0L
    for (i in begin.toLong() .. end.toLong())
        result += ones(i)
    return result
}

fun ones(n: Long) = Integer.toBinaryString(n.toInt()).count { it == '1' }.toLong()