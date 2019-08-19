package languageExamples.coroutines.e001_Suspend

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Before function call")
        val str = longTimeFunction("Emily")
        println("Right after function call")
        println("Reversed: $str")
    }
}

suspend fun longTimeFunction(str: String): String {
    println("Function started")
    delay(10_000)
    println("Delay ended")
    return str.reversed()
}