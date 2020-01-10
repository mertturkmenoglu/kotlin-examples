package practice.problemSolving.e029_ArmstrongNumber

import kotlin.math.pow

fun isArmstrong(number: Int) = number.toString()
        .asIterable().sumBy { it.toString().toDouble().pow(number.toString().length.toDouble()).toInt() } == number


fun main() {
    println(isArmstrong(153))
    println(isArmstrong(407))
    println(isArmstrong(100))
}