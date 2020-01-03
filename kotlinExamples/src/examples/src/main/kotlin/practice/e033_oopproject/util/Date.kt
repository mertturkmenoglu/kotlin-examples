package practice.e033_oopproject.util

import java.util.*

class Date(var day: Int = 0, var month: Int = 0, var year: Int = 0) {
    fun isAfterThan(other: Date) = when {
        this.year > other.year -> true
        this.year < other.year -> false
        this.month > other.month -> true
        this.month < other.month -> false
        this.day >= other.day -> !isEqualsWith(other)
        else -> false
    }

    fun isBeforeThan(other: Date) = when {
        this.year < other.year -> true
        this.year > other.year -> false
        this.month < other.month -> true
        this.month > other.month -> false
        this.day <= other.day -> !isEqualsWith(other)
        else -> false
    }


    fun isEqualsWith(other: Date) = this.day == other.day && this.month == other.month && this.year == other.year

    companion object {
        fun getToday() = Date().apply {
            with(this) {
                with(GregorianCalendar()) {
                    day = get(Calendar.DAY_OF_MONTH)
                    month = get(Calendar.MONTH) + 1
                    year = get(Calendar.YEAR)
                }
            }
        }
    }
}