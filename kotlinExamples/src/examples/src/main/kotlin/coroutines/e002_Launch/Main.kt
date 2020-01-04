package coroutines.e002_Launch

import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    // In this example, code execution will not be blocked
    // Example output:
    //
    // Program started: 20:06:01
    // After launch: 20:06:01
    // After delay, inside launch: 20:06:03
    // Program ended: 20:06:06
    println("Program started: ${getCurrentTimeFormatted()}")

    GlobalScope.launch {
        delay(2_000L)
        println("After delay, inside launch: ${getCurrentTimeFormatted()}")
    }

    println("After launch: ${getCurrentTimeFormatted()}")
    Thread.sleep(5_000L)
    println("Program ended: ${getCurrentTimeFormatted()}")
}