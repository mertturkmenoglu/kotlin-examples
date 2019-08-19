package languageExamples.coroutines.e009_CoroutineScope

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        println("Inside launch, before delay")
        delay(3000L)
        println("Inside launch, after delay")
    }

    coroutineScope {
        launch {
            delay(1500L)
            println("Nested launch ends")
        }

        delay(1000L)
        println("Coroutine scope ends")
    }

    println("Run blocking ends")
}