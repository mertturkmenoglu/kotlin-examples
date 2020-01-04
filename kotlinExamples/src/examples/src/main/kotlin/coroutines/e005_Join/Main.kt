package coroutines.e005_Join

import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalTime

fun main() {
    runBlocking {
        println("Program starts: ${getCurrentTimeFormatted()}")

        val job = GlobalScope.launch {
            println("Inside launch, before delay: ${getCurrentTimeFormatted()}")
            delay(5_000L)
            println("Inside launch, after delay: ${getCurrentTimeFormatted()}")
        }

        println("After launch: ${getCurrentTimeFormatted()}")
        job.join() // Wait until job completes
        println("Program ends: ${getCurrentTimeFormatted()}")
    }
}