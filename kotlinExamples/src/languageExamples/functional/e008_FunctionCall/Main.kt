package languageExamples.functional.e008_FunctionCall

import java.time.Duration
import java.time.Instant

object Mark {
    fun <T> time(function: () -> T?): Pair<T?, Duration> {
        val begin = Instant.now()
        var result: T? = null
        try {
            result = function()
        } finally {
            val end = Instant.now()
            return result to Duration.between(end, begin)
        }
    }
}

fun main() {
    val (result, time) = Mark.time {
        var sum = 0
        for (i in 0 .. 100000) {
            sum += i
        }
        sum
    }

    println(result)
    println(time.nano)
}