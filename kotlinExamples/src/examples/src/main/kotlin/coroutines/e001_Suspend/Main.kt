package coroutines.e001_Suspend

import coroutines.TimeUtil
import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    // Run blocking scope
    // It will block the execution until the function call completed
    // Expected output:
    //
    // Before function call
    // Function started
    // Delay ended
    // Right after function call
    // Reversed: ylimE
    runBlocking {
        println("Before function call: ${getCurrentTimeFormatted()}")
        val str = longTimeFunction("Emily")
        println("Right after function call: ${getCurrentTimeFormatted()}")
        println("Reversed: $str")
    }
}

suspend fun longTimeFunction(str: String): String {
    println("Function started: ${getCurrentTimeFormatted()}")
    delay(10_000)
    println("Delay ended: ${getCurrentTimeFormatted()}")
    return str.reversed()
}