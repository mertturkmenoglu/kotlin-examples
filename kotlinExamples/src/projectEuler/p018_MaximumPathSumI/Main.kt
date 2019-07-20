package projectEuler.p018_MaximumPathSumI

import java.io.File

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle below:
 *
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route.
 * However, Problem 67, is the same challenge with a triangle containing one-hundred rows;
 * it cannot be solved by brute force, and requires a clever method! ;o)
 */
const val relativePath = "/kotlinExamples/src/projectEuler/p018_MaximumPathSumI/numbers.txt"

fun main() {
    val triangle = ArrayList<MutableList<Int>>()

    File(System.getProperty("user.dir") + relativePath).forEachLine { line ->
        triangle.add(
                line.chunked(3) {
                    it.filter { c -> c != ' ' }.dropWhile { c -> c == '0' }
                }.map { it.toString().toInt() }.toMutableList()
        )
    }

    val result = maxPath(triangle)
    println(result)
}


fun maxPath(triangle: ArrayList<MutableList<Int>>): Int {
    if (triangle.size == 1) {
        return triangle.first().first()
    }

    val tmp = MutableList(0) { 0 }
    triangle[triangle.size - 2].forEachIndexed { i, e ->
        tmp.add(e + maxOf(triangle[triangle.size - 1][i], triangle[triangle.size - 1][i + 1]))
    }

    repeat(2) { triangle.removeAt(triangle.lastIndex) }
    triangle.add(tmp)

    return maxPath(triangle)
}