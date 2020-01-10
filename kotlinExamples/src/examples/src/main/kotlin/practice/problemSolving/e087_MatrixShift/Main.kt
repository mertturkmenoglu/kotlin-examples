package practice.problemSolving.e087_MatrixShift

fun main() {
    val input = listOf(listOf('a', 'b', 'c', 'd'), listOf('1', '2', '3', '4'), listOf('e', 'm', 'i', 'l'), listOf('y', '5', '6', '7'))
    val n = 1
    val result = shift(input, n)
    input.forEach(::println)
    println("--------")
    result.forEach(::println)
}

fun <T> shift(mtr: List<List<T>>, n: Int): List<List<T>> {
    return if (n == 0) {
        mtr
    } else {
        val result = ArrayList<List<T>>()

        for (rowIndex in mtr.lastIndex downTo 1) {
            result.add(0, listOf(mtr[rowIndex - 1].last()) + mtr[rowIndex].dropLast(1))
        }

        shift(result.apply { add(0, listOf(mtr[mtr.lastIndex].last()) + mtr[0].dropLast(1)) }, n - 1)
    }
}