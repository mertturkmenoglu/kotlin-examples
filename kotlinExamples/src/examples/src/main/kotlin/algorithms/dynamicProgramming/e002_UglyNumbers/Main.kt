package algorithms.dynamicProgramming.e002_UglyNumbers

fun main() {
    val n = 150 // Expected output is 5832
    println(uglyNumber(n = n))
}

fun uglyNumber(n: Int): Int {
    val numbers = Array(n) { 0 }
    numbers[0] = 1

    var i2 = 0 // Index for 2
    var i3 = 0 // Index for 3
    var i5 = 0 // Index for 5

    var nextMul2 = 2
    var nextMul3 = 3
    var nextMul5 = 5

    for (j in 1 until n) {
        numbers[j] = minOf(nextMul2, nextMul3, nextMul5)

        if (numbers[j] == nextMul2) {
            i2++
            nextMul2 = numbers[i2] * 2
        }

        if (numbers[j] == nextMul3) {
            i3++
            nextMul3 = numbers[i3] * 3
        }

        if (numbers[j] == nextMul5) {
            i5++
            nextMul5 = numbers[i5] * 5
        }
    }

    return numbers.last()
}