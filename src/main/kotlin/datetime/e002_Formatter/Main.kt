package datetime.e002_Formatter

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@Suppress("SpellCheckingInspection")
fun main() {
    val dateString = "September 13, 2042"
    val formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH)
    val dateObject = LocalDate.parse(dateString, formatter)

    println(dateObject)
}