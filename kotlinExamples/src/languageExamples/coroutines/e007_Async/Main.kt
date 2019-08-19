package languageExamples.coroutines.e007_Async

import kotlinx.coroutines.*

fun main() {
    println("Program started")
    val deferredName = GlobalScope.async {
        println("Before delay")
        delay(3000L)
        "Emily"
    }

    runBlocking {
        println("The name is ${deferredName.await()}")
    }
}