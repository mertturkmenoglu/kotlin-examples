@file:Suppress("SpellCheckingInspection")

package languageExamples.enums.e001_Enum

fun main() {
    for (day in Days.values()) {
        println("${day.ordinal + 1}. Day: ${day.name}")
    }

    println("${Days.valueOf("LUNES")}")
}