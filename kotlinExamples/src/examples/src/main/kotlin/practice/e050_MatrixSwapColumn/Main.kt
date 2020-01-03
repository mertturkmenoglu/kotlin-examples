package practice.e050_MatrixSwapColumn

import kotlin.random.Random

fun main() {
    val n = 5
    val input = Array(n) { Array(n) { Random.nextInt(0, 10) } }

    printMatrix(input)
    println()
    println()

    val result = matrixSwapColumns(input, 0, 3)
    printMatrix(result)
}

fun <T> printMatrix(m: Array<Array<T>>) = m.forEach { println(it.asList()) }

fun <T> matrixSwapColumns(m: Array<Array<T>>, f: Int, s: Int): Array<Array<T>> {
    val r = m.clone()
    repeat(m.size) { i -> r[i][f] = r[i][s].also { r[i][s] = r[i][f] } }

    return r
}
