package algorithms.graph.e001_A_Star

fun main() {
    val grid = listOf(
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(1, 1, 1, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 1, 1, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    )

    println("Enter start y pos: ")
    val starty = readLine()?.toInt() ?: throw Exception()

    println("Enter start x pos: ")
    val startx = readLine()?.toInt() ?: throw Exception()

    println("Enter end y pos: ")
    val endy = readLine()?.toInt() ?: throw Exception()

    println("Enter end x pos: ")
    val endx = readLine()?.toInt() ?: throw Exception()

    val path = aStar(grid, starty to startx, endy to endx)

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            val msg = when {
                i to j == starty to startx -> 's'
                i to j == endy to endx -> 'e'
                path != null && i to j in path -> '.'
                else -> grid[i][j].toString().first()
            }

            print("$msg ")
        }

        println()
    }

}