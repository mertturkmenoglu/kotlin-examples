package languageExamples.datetime.e001_Formatter

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val dateString = "2019-09-17"
    val dateObject = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE)

    println(dateObject.year)
    println(dateObject.month)
    println(dateObject.dayOfMonth)
}