package languageExamples.e038_ScopingFunctions

import languageExamples.e037_OperatorOverloading.Complex
import java.lang.StringBuilder
import java.util.*

fun transform(value: Int) = value + 1

fun <T> log(message: T) = println(message)
val DEFAULT_VALUE = Double.NaN

object GetRandomFromARange {
    fun ClosedRange<Int>.random() =
            Random().nextInt(endInclusive - start) + start
}

fun main() {
    val text: String? = "Hi"
    val len = text?.let {
        log("Assign length of string")
        it.length
    } ?: 0
    log(len)

    val value: Int? = 5
    val mapped: Double = value?.let { transform(it) }?.toDouble() ?: DEFAULT_VALUE
    log(mapped)

    ///////////////////////////////////////////////////////////////////////////////

    val text2: String? = null
    val len2 = text2?.run {
        log("Assign length of string")
        length
    } ?: 0

    log(len2)

    val date = Calendar.getInstance().run {
        set(Calendar.YEAR, 2077)
        get(Calendar.DAY_OF_YEAR)
    }

    log(date)

    //////////////////////////////////////////////////////////////////////////////

    val specialNumber: Int = 42.also { log("Very special number") }
    log(specialNumber)
    val cNumber = Complex(3, 4).also { it.real = 5.0 }
    log(cNumber)

    //////////////////////////////////////////////////////////////////////////////

    val cNumber2 = Complex().apply { real = 3.0; imag = 4.0 }
    log(cNumber2)
    val pair = Pair().getKey(3).getValue("Emily")
    log(pair)

    //////////////////////////////////////////////////////////////////////////////

    val name: String = with(StringBuilder()) {
        append("Emily").append(" ").append("Smith")
        toString()
    }

    log(name)

    with(GetRandomFromARange) {
        val rnd = (0..10).random()
        log(rnd)
    }

}