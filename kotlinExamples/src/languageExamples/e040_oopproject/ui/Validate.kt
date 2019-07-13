package languageExamples.e040_oopproject.ui

import java.text.ParseException
import java.text.SimpleDateFormat

object Validate {

    private const val DATE_FORMAT = "dd-MM-yyyy"

    fun hourlyFee(fee: String?): Boolean {
        val value: Double

        if (fee == null) {
            return false
        }

        try {
            value = java.lang.Double.valueOf(fee)
        } catch (e: NumberFormatException) {
            return false
        }

        return !(fee.isEmpty() || value <= 0)
    }

    fun capacity(capacity: String): Boolean {
        val value: Int

        try {
            value = Integer.valueOf(capacity)
        } catch (e: NumberFormatException) {
            return false
        }

        return !(capacity.isEmpty() || value <= 0)
    }

    fun plate(plate: String?): Boolean {
        return plate?.isNotEmpty() ?: false
    }

    fun hour(hour: String?): Boolean {
        val value: Int

        if (hour == null) {
            return false
        }

        try {
            value = Integer.valueOf(hour)
        } catch (e: NumberFormatException) {
            return false
        }

        return !(hour.isEmpty() || value < 0 || value >= 24)
    }

    fun minute(minute: String): Boolean {
        val value: Int

        try {
            value = Integer.valueOf(minute)
        } catch (e: NumberFormatException) {
            return false
        }

        return !(minute.isEmpty() || value < 0 || value >= 60)
    }

    fun date(date: String?): Boolean {
        if (date == null) {
            return false
        }

        return try {
            val dateFormat = SimpleDateFormat(DATE_FORMAT)
            dateFormat.isLenient = false
            dateFormat.parse(date)
            true
        } catch (e: ParseException) {
            false
        }
    }
}