package practice.e001_NextBiggerNumber

/**
 * Given a positive integer, return the next bigger number formed by the same digits
 */

fun nextNumber(number: Int): Int {
    val digits = number.toString().toCharArray()
    val bn: ArrayList<Int> = ArrayList()
    digits.reversed().forEachIndexed { i, _ ->
        for (j in i - 1 downTo 0) {
            run {
                digits[i] = digits[j].also { digits[j] = digits[i] }
                val tmp = digits.joinToString(separator = "").toInt()
                if (tmp > number)
                    bn.add(tmp)
            }
        }
    }

    return bn.sorted().find { it > number } ?: -1
}

fun main() {
    println(nextNumber(8392))
    println(nextNumber(546))
    println(nextNumber(432))
}