package languageExamples.coroutines.e006_Scope

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalTime

fun main() = runBlocking {
    println("Program starts: ${LocalTime.now()}")

    launch {
        println("Inside launch, before delay: ${LocalTime.now()}")
        delay(10_000L)
        println("Inside launch, after delay: ${LocalTime.now()}")
    }

    println("After launch: ${LocalTime.now()}")
}