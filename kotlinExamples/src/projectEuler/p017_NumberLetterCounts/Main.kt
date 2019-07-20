package projectEuler.p017_NumberLetterCounts

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 *
 *
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
 * 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */

val tens = mapOf(Pair(0, ""), Pair(1, " ten"), Pair(2, " twenty"), Pair(3, " thirty"),
        Pair(4, " forty"), Pair(5, " fifty"), Pair(6, " sixty"), Pair(7, " seventy"),
        Pair(8, " eighty"), Pair(9, " ninety"))

val nums = mapOf(Pair(0, ""), Pair(1, " one"), Pair(2, " two"), Pair(3, " three"), Pair(4, " four"), Pair(5, " five"),
        Pair(6, " six"), Pair(7, " seven"), Pair(8, " eight"), Pair(9, " nine"), Pair(10, " ten"),
        Pair(11, " eleven"), Pair(12, " twelve"), Pair(13, " thirteen"), Pair(14, " fourteen"), Pair(15, " fifteen"),
        Pair(16, " sixteen"), Pair(17, " seventeen"), Pair(18, " eighteen"), Pair(19," nineteen"))

fun main() {
    val result = letterCount(range = 1..1000)
    println(result)
}

fun letterCount(range: IntRange): Int {
    val words = ArrayList<String>()

    for (number in range) {
        words.add(number.word())
    }

    return words.flatMap { it.toList() }.filter { it != ' ' }.size
}

fun Int.word(): String {
    return when (this.toString().length) {
        1 -> nums[this] ?: error("")
        2 -> if (nums[this] != null) nums[this] ?: error("") else tens[this.toString().first().toString().toInt()] + nums[this.toString().last().toString().toInt()]
        3 -> {
            val result = nums[this.toString().first().toString().toInt()] + " hundred"
            val rest = this.toString().drop(1).toInt().word().trim()
            if (rest != "")
                "$result and $rest"
            else
                result
        }
        4 -> {
            val result = nums[this.toString().first().toString().toInt()] + " thousand"
            val rest = this.toString().drop(1).toInt().word().trim()
            if (rest != "")
                "$result and $rest"
            else
                result
        }
        else -> error("")
    }.trim()
}