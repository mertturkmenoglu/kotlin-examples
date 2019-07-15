package practice.e006_HumanReadableDurationFormat

import java.lang.IllegalArgumentException

fun format(n: Int): String {
    if (n < 0) throw IllegalArgumentException("Negative value")

    if (n == 0) return "Now"

    var years = 0
    var days = 0
    var hours = 0
    var minutes = 0
    var seconds = 0

    var time = n

    while (time > 0) {
        if (time > 60) {
            seconds += 60
        } else {
            seconds = time % 60
        }

        if (seconds >= 60) {
            minutes++
            seconds %= 60
        }

        if (minutes >= 60) {
            hours++
            minutes %= 60
        }

        if (hours >= 24) {
            days++
            hours %= 24
        }

        if (days >= 365) {
            years++
            days %= 365
        }

        time -= 60
    }

    return "$years years, $days days, $hours hours, $minutes minutes and $seconds seconds"
}

fun main() {
    println(format(62))
    println(format(3662))
    println(format(90061))
    println(format(742985290))
}