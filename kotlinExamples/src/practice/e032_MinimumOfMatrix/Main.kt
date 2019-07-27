package practice.e032_MinimumOfMatrix

import kotlin.random.Random

fun findMin(mtr: Array<Array<Int>>): Int {
    var maxIndex = -1
    var maxCount = -1

    mtr.forEachIndexed { index, it ->
        val current = it.count { num -> num == 1 }
        if (maxCount < current) {
            maxIndex = index
            maxCount = current
        }
    }

    return maxIndex
}

fun main() {
    val mtr = Array(3) { Array(3) { Random.nextInt(0, 2) } }
    mtr.forEach {
        println(it.asList())
    }

    println(findMin(mtr))
}