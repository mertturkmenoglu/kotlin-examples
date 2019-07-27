package practice.e018_BigSum


import kotlin.random.Random


// Create two n-digit number and add them. Use arrays
fun main() {
    val n = Random.nextInt(5, 10)
    val num1 = Array(n) { 0 }
    val num2 = Array(n) { 0 }

    for (i in 0 until n) {
        num1[i] = Random.nextInt(0, 10)
        num2[i] = Random.nextInt(0, 10)
    }



    val sum = addBigNumbers(num1, num2)

    if (sum.size > num1.size) {
        print("   ")
        println(num1.asList())
        print("   ")
        println(num2.asList())
    } else {
        println(num1.asList())
        println(num2.asList())
    }
    println(sum.asList())
}


fun addBigNumbers(num1: Array<Int>, num2: Array<Int>): Array<Int> {
    var overflow = 0
    val num3 = Array(num1.size + 1) { 0 }

    for (i in num1.size - 1 downTo 0) {
        num3[i + 1] = num1[i] + num2[i] + overflow
        if (overflow != 0) {
            overflow--
        }
        if (num3[i + 1] > 9) {
            overflow++
            num3[i + 1] -= 10
        }
    }

    return if (overflow != 0) {
        num3[0] = overflow
        num3
    } else {
        num3.copyOfRange(1, num3.lastIndex + 1)
    }
}
