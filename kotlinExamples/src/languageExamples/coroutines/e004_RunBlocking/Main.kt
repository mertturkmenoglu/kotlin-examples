package languageExamples.coroutines.e004_RunBlocking

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalTime

fun main() {
    runBlocking {
        println("Start of program: ${LocalTime.now()}")

        GlobalScope.launch {
            delay(10_000L)
            println("Inside launch after delay: ${LocalTime.now()}")    // Will not hit this point
        }

        println("After launch: ${LocalTime.now()}")
        delay(2_000L)
        println("End of program: ${LocalTime.now()}")
    }
}