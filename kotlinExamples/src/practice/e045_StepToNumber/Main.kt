package practice.e045_StepToNumber

/**
 * Find how many steps take to reach a number:
 * - Start from 1
 * - You can multiply by two or increase by one
 * - Find the shortest way to reach the given number
 */
fun main() {
    val n = 12
    val result = steps(n)
    println(result)
}

fun steps(n: Int): List<Int> {
    var tmp = n
    val r = ArrayList<Int>().apply { add(tmp) }

    while (tmp != 1) {
        tmp = if (tmp % 2 == 0) tmp / 2 else tmp - 1
        r.add(tmp)
    }

    return r.reversed()
}