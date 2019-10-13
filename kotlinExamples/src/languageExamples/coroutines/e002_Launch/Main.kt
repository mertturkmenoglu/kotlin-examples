package languageExamples.coroutines.e002_Launch

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalTime

fun main() {
    println("Program started: ${LocalTime.now()}")
    GlobalScope.launch {
        delay(2_000L)
        println("After delay, inside launch: ${LocalTime.now()}")
    }
    println("After launch: ${LocalTime.now()}")
    Thread.sleep(5_000L)
    println("Program ended: ${LocalTime.now()}")
}