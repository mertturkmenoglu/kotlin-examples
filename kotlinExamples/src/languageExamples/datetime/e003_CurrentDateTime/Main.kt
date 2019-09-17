package languageExamples.datetime.e003_CurrentDateTime

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun main() {
    val currentDateAndTime = LocalDateTime.now()
    println("Current date and time: $currentDateAndTime")

    // Get with pattern
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formattedDateTime = currentDateAndTime.format(formatter)

    println("Formatted current date and time: $formattedDateTime")

    // Predefined
    val predefinedFormatter = DateTimeFormatter.BASIC_ISO_DATE
    val predefinedFormattedDateTime = currentDateAndTime.format(predefinedFormatter)

    println("Predefined formatted current date and time: $predefinedFormattedDateTime")

    // Localized
    val localizedFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    val localizedFormattedDateTime = currentDateAndTime.format(localizedFormatter)

    println("Localized current date and time: $localizedFormattedDateTime")
}