package languageExamples.coroutines.e003_RunBlocking

import kotlinx.coroutines.*
import java.time.LocalTime

fun main() {
    println("Program starts: ${LocalTime.now()}")

    GlobalScope.launch {
        println("Inside launch, before delay: ${LocalTime.now()}")
        delay(3_000L)
        println("Inside launch, after delay: ${LocalTime.now()}")
    }

    println("After launch: ${LocalTime.now()}")

    runBlocking {
        delay(7_000L)
    }

    println("End of program: ${LocalTime.now()}")
}