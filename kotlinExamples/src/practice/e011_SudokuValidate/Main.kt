package practice.e011_SudokuValidate

fun validate(board: Array<Array<Int>>): Boolean {
    if (board.size != 9 || board.any { it.size != 9 }) return false
    if (board.any { it.any{ e -> e !in 0..9}}) return false
    if (board.any { it.toSet().size != it.size }) return false

    repeat(board.first().size) { i ->
        with(sequence { board.forEach { yield(it[i]) } }.toList()) {
            if (toSet().size != size) return false
        }
    }

    // TODO: Check 3x3 area

    return true
}

fun main() {
    val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(7, 8, 9 ,1, 2, 3, 4, 5, 6),
            arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 1),
            arrayOf(5, 6, 7, 8, 9, 1, 2, 3, 4),
            arrayOf(8, 9, 1, 2, 3, 4, 5, 6, 7),
            arrayOf(3, 4, 5, 6, 7, 8, 9, 1, 2),
            arrayOf(6, 7, 8, 9, 1, 2, 3, 4, 5),
            arrayOf(9, 1, 2, 3, 4, 5, 6, 7, 8)
    )

    board.forEach { println(it.asList()) }
    println(validate(board))
}