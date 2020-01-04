package coroutines.e003_RunBlocking

import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Program starts: ${getCurrentTimeFormatted()}")

    GlobalScope.launch {
        println("Inside launch, before delay: ${getCurrentTimeFormatted()}")
        delay(3_000L)
        println("Inside launch, after delay: ${getCurrentTimeFormatted()}")
    }

    println("After launch: ${getCurrentTimeFormatted()}")

    runBlocking {
        delay(7_000L)
    }

    println("End of program: ${getCurrentTimeFormatted()}")
}