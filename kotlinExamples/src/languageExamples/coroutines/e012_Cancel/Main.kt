package languageExamples.coroutines.e012_Cancel

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat (1000) {
            println("$it")
            delay(300L)
        }
    }

    delay(2000L)
    println("After delay")

    // or job.cancelAndJoin()
    job.cancel()
    job.join()

    println("End")
}