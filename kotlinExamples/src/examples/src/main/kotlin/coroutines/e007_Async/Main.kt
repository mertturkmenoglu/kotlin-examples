package coroutines.e007_Async

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

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