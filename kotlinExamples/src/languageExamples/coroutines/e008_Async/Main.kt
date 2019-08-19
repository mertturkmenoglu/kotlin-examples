package languageExamples.coroutines.e008_Async

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Program started")

    val deferredName = async {
        println("Before delay")
        delay(3000L)
        println("After delay")
        "Emily"
    }

    println("Deferred name: ${deferredName.await()}")
}