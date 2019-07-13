package languageExamples.e020_MatrixRotate

fun main() {

    println("Please enter row number: ")
    val row = readLine()!!.toInt()
    println("Please enter column number: ")
    val col = readLine()!!.toInt()

    val mtr = Array(row) { Array(col) { 0 } }
    for (i in 0 until row) {
        for (j in 0 until col) {
            mtr[i][j] = i * col + j
        }
    }

    for (Row in mtr) {
        println(Row.asList())
    }

    rotateX(mtr)

    for (Row in mtr) {
        println(Row.asList())
    }

    // Revert to original
    rotateX(mtr)

    // --------------

    for (Row in mtr) {
        println(Row.asList())
    }

    rotateY(mtr)

    for (Row in mtr) {
        println(Row.asList())
    }
}

fun rotateY(mtr: Array<Array<Int>>) {
    val row = mtr.size
    val col = mtr[0].size

    for (i in 0 until row) {
        for (j in 0 until (col / 2)) {
            mtr[i][j] = mtr[i][col - j - 1].also { mtr[i][col - j - 1] = mtr[i][j] }
        }
    }
}

fun rotateX(mtr: Array<Array<Int>>) {
    val row = mtr.size
    val col = mtr[0].size

    for (i in 0 until (row / 2)) {
        for (j in 0 until col) {
            mtr[i][j] = mtr[row - i - 1][j].also { mtr[row - i -1][j] = mtr[i][j] }
        }
    }
}
