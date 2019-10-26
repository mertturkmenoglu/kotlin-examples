package languageExamples.algorithms.math.e001_GCD

import kotlin.math.abs
import kotlin.random.Random

fun main() {
    val fst = Random.nextInt(20, 40)
    val snd = Random.nextInt(20, 40)
    val result = gcd(fst, snd)
    println("$fst - $snd: $result")
}

private fun gcd(fst: Int, snd: Int): Int {
    require(fst >= 0 && snd >= 0)

    if (fst == 0 || snd == 0) return abs(fst - snd)

    var a = fst
    var b = snd

    while (a % b != 0) {
        val rem = a % b
        a = b
        b = rem
    }

    return b
}