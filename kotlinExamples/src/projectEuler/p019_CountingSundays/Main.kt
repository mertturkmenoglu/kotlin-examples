package projectEuler.p019_CountingSundays

import java.util.*

/**
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
fun main() {
    val result = countSundays(begin = GregorianCalendar().apply { set(1901, 0, 1) },
            end = GregorianCalendar().apply { set(2000, 11, 31) })
    println(result)
}

fun countSundays(begin: GregorianCalendar, end: GregorianCalendar): Int {
    var counter = 0

    while (begin < end) {
        if (begin[Calendar.DAY_OF_MONTH] == 1 && begin[Calendar.DAY_OF_WEEK] == Calendar.SUNDAY)
                counter++
        begin.add(Calendar.DAY_OF_WEEK, 1)
    }

    return counter
}