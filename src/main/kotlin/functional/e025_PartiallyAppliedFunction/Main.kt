package functional.e025_PartiallyAppliedFunction

fun sumThreeNumbers(x: Int) = { y: Int -> { z: Int -> x + y + z } }

fun main() {
    val partiallyApplied1 = sumThreeNumbers(1)
    val partiallyApplied2 = sumThreeNumbers(1)(2)
    val partiallyApplied3 = sumThreeNumbers(1)(2)(3)

    println(sumThreeNumbers(1)(2)(3))
    println(partiallyApplied1(2)(3))
    println(partiallyApplied2(3))
    println(partiallyApplied3)
}