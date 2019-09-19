package languageExamples.other.e001_ExceptionHandling

import java.lang.Exception

fun main() {
    val arr = arrayOf(3, 4, 5, 6, 7, 0, 6)

    try {
        for (i in 0..arr.size)
        println("$i -th element: ${arr[i]}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        e.printStackTrace()
    } finally {
        println("Finally block always executes")
    }

    try {
        for (i in 0..10) {
            println(i)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Finally block always executes")
    }

    println("End of program")
}