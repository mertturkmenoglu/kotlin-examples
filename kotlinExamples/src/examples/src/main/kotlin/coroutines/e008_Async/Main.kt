package coroutines.e008_Async

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

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