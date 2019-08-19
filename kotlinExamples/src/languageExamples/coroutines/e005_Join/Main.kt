package languageExamples.coroutines.e005_Join

import kotlinx.coroutines.*
import java.time.LocalTime

fun main() {
    runBlocking {
        println("Program starts: ${LocalTime.now()}")

        val job = GlobalScope.launch {
            println("Inside launch, before delay: ${LocalTime.now()}")
            delay(10_000L)
            println("Inside launch, after delay: ${LocalTime.now()}")
        }

        println("After launch: ${LocalTime.now()}")
        job.join() // Wait until job completes
        println("Program ends: ${LocalTime.now()}")
    }
}