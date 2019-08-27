package practice.e001_NextBiggerNumber

/**
 * Given a positive integer, return the next bigger number formed by the same digits
 */
fun main() {
    println(nextNumber(8392))
    println(nextNumber(546))
    println(nextNumber(432))
}

fun nextNumber(n: Int): Int {
    require(n > 0) { "Works on positive numbers" }

    val digits = n.toString().toCharArray()
    var max = Int.MAX_VALUE

    for (i in digits.indices) {
        for (j in i - 1 downTo 0) {
            digits[i] = digits[j].also { digits[j] = digits[i] }
            digits.joinToString("").toInt().let { if (it in n .. max) max = it }
        }
    }

    return if (max != Int.MAX_VALUE) max else -1
}