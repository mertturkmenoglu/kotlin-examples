package practice.e005_DigitDelete

import java.lang.IllegalArgumentException

fun deleteDigit(number: Int): Int {
    if (number !in 10..1000000) {
        throw IllegalArgumentException("Argument is out of range")
    }

    return number.toString().let { str ->
        sequence {
            str.forEach { yield(str.toCharArray().filter { c -> c != it }
                    .joinToString(separator = "").toInt()) }
        }.maxBy { it }!!.toInt()
    }
}

fun main() {
    val a = deleteDigit(152)
    println(a)
}