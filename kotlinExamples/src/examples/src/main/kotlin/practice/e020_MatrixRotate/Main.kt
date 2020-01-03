package practice.e020_MatrixRotate

fun main() {
    println("Please enter row number: ")
    val row = readLine()?.toInt() ?: throw Exception()

    println("Please enter column number: ")
    val col = readLine()?.toInt() ?: throw Exception()

    val mtr = MutableList(row) { i -> MutableList(col) { j -> i * col + j } }

    mtr.forEach(::println)
    rotateX(mtr)
    mtr.forEach(::println)

    // Revert to original
    rotateX(mtr)

    mtr.forEach(::println)
    rotateY(mtr)
    mtr.forEach(::println)
}

fun rotateY(mtr: MutableList<MutableList<Int>>) {
    for (i in mtr.indices) {
        for (j in 0 until mtr.first().size / 2) {
            mtr[i][j] = mtr[i][mtr.first().size - j - 1].also { mtr[i][mtr.first().size - j - 1] = mtr[i][j] }
        }
    }
}

fun rotateX(mtr: MutableList<MutableList<Int>>) {
    for (i in 0 until mtr.size / 2) {
        for (j in mtr.first().indices) {
            mtr[i][j] = mtr[mtr.size - i - 1][j].also { mtr[mtr.size - i - 1][j] = mtr[i][j] }
        }
    }
}
