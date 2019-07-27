package practice.e031_MatrixSort

import kotlin.random.Random

inline fun <reified T> matrixSort(mtr: Array<Array<T>>) {
    val rCount = mtr.size
    val cCount = mtr[0].size

    val tmp = Array<Any?>(rCount * cCount) { }
    mtr.forEachIndexed { rIndex, row ->
        row.forEachIndexed { cIndex, _ ->
            tmp[rIndex * cCount + cIndex] = mtr[rIndex][cIndex]
        }
    }

    tmp.sort()

    for (i in 0 until rCount) {
        for (j in 0 until cCount) {
            mtr[i][j] = tmp[i * cCount + j] as T
        }
    }
}

fun main() {
    val mtr = Array(3) { Array(3) { Random.nextInt(-5, 20) } }
    mtr.forEach {
        println(it.asList())
    }

    matrixSort(mtr)
    mtr.forEach {
        println(it.asList())
    }
}