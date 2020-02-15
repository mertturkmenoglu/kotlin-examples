package coroutines.e013_Channels

import coroutines.TimeUtil.getCurrentTimeFormatted
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Started: ${getCurrentTimeFormatted()}")
        val ch = Channel<Int>()

        launch {
            var y = 1
            for (x in 0..5) {
                println("Now adding: $y")
                y += y
                ch.send(y)
            }

            ch.close()
        }

        for (y in ch) {
            println("Time: ${getCurrentTimeFormatted()} Value: $y")
        }
    }
}