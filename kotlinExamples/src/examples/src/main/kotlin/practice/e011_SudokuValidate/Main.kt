package practice.e011_SudokuValidate

fun validate(board: Array<Array<Int>>): Boolean {
    if (board.size != 9 || board.any { it.size != 9 }) return false
    if (board.any { it.any { e -> e !in 0..9 } }) return false
    if (board.any { it.toSet().size != it.size }) return false

    repeat(board.first().size) { i ->
        with(sequence { board.forEach { yield(it[i]) } }.toList()) {
            if (toSet().size != size) return false
        }
    }

    repeat(3) { i ->
        val f = board.toList().slice(i * 3..i * 3 + 2)

        repeat(3) { j ->
            val numbers = MutableList(0) { 0 }
            f.forEach {
                val a = sequence { yield(it.slice(j * 3..j * 3 + 2)) }.flatten()
                numbers.addAll(a)
            }

            val b = numbers.groupingBy { it }.eachCount().values.find { it != 1 } == null
            if (!b) {
                return false
            }
        }
    }

    return true
}

fun main() {
    val v = Array(9) { Array(9) { 0 } }
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            v[i][j] = i * 9 + j
        }
    }

    val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 1),
            arrayOf(5, 6, 7, 8, 9, 1, 2, 3, 4),
            arrayOf(8, 9, 1, 2, 3, 4, 5, 6, 7),
            arrayOf(3, 4, 5, 6, 7, 8, 9, 1, 2),
            arrayOf(6, 7, 8, 9, 1, 2, 3, 4, 5),
            arrayOf(9, 1, 2, 3, 4, 5, 6, 7, 8)
    )

    val falseBoard = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 1),
            arrayOf(3, 4, 5, 6, 7, 8, 9, 1, 2),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(5, 6, 7, 8, 9, 1, 2, 3, 4),
            arrayOf(6, 7, 8, 9, 1, 2, 3, 4, 5),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(8, 9, 1, 2, 3, 4, 5, 6, 7),
            arrayOf(9, 1, 2, 3, 4, 5, 6, 7, 8)
    )

    println(validate(board))
    println(validate(v))
    println(validate(falseBoard))
}