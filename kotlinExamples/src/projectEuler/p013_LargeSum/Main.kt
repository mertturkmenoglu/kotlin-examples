package projectEuler.p013_LargeSum

import java.io.File
import java.math.BigInteger

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */
const val relativePath = "/kotlinExamples/src/projectEuler/p013_LargeSum/numbers.txt"

fun main() {
    val result = addBigNumbers()
    println(result.toString().take(10))
}

fun addBigNumbers(): BigInteger {
    val numbers = ArrayList<BigInteger>()

    File(System.getProperty("user.dir") + relativePath).forEachLine {
        numbers.add(BigInteger(it))
    }

    return numbers.reduce { acc, bigInteger ->  acc + bigInteger }
}