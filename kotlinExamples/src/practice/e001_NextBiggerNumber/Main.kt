package practice.e001_NextBiggerNumber

/**
 * Given a positive integer, return the next bigger number formed by the same digits
 */
fun main() {
    println(nextNumber(8392))
    println(nextNumber(546))
    println(nextNumber(432))
}

fun nextNumber(number: Int): Int {
    require(number > 0) { "Works on positive numbers" }
    val digits = number.toString().toCharArray()
    val greaterNumbers = ArrayList<Int>()

    digits.reversed().forEachIndexed { i, _ ->
        for (j in i - 1 downTo 0) {
            run {
                digits[i] = digits[j].also { digits[j] = digits[i] }
                val tmp = digits.joinToString(separator = "").toInt()
                if (tmp > number)
                    greaterNumbers.add(tmp)
            }
        }
    }

    return greaterNumbers.sorted().find { it > number } ?: -1
}