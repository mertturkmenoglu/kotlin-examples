package coroutines.e006_Scope

import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Program starts: ${getCurrentTimeFormatted()}")

    launch {
        println("Inside launch, before delay: ${getCurrentTimeFormatted()}")
        delay(10_000L)
        println("Inside launch, after delay: ${getCurrentTimeFormatted()}")
    }

    println("After launch: ${getCurrentTimeFormatted()}")
}