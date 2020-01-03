package practice.e005_DigitDelete

fun deleteDigit(number: Int): Int {
    require(number in 10..1_000_000) { "Argument is out of range" }

    val str = number.toString()
    val numbers = sequence {
        str.forEach {
            val n = str.toCharArray()
                    .filter { c -> c != it }
                    .joinToString("")
                    .toInt()
            yield(n)
        }
    }

    return numbers.max() ?: throw Exception()
}

fun main() {
    val a = deleteDigit(152)
    println(a)
}