package algorithms.graph.e003_PrimMST

class Graph(val n: Int) {
    var graph = Array(n) { Array(n) { 0 } }

    fun prim(): List<Pair<Pair<Int, Int>, Int>> {
        val selected = Array(n) { false }.apply { this[0] = true }
        val path = arrayListOf<Pair<Pair<Int, Int>, Int>>()

        for (ignored in 0 until n-1) {
            val visited = selected.withIndex().filter { it.value }.map { it.index }
            val unvisited = selected.withIndex().filterIndexed { i, _ -> i !in visited }.map { it.index }

            var min = Integer.MAX_VALUE
            var x = 0
            var y = 0

            for (i in visited) {
                for (j in unvisited) {
                    if (graph[i][j] != 0 && graph[i][j] < min) {
                        min = graph[i][j]
                        x = i
                        y = j
                    }
                }
            }

            path.add( (x to y) to min )
            selected[y] = true
        }

        return path
    }
}

fun main() {
    val g = Graph(5).apply {
        graph = arrayOf(
                arrayOf(0, 9, 75, 0, 0),
                arrayOf(9, 0, 95, 19, 42),
                arrayOf(75, 95, 0, 51, 66),
                arrayOf(0, 19, 51, 0, 31),
                arrayOf(0, 42, 66, 31, 0)
        )
    }

    for (e in g.prim()) {
        println("${e.first}: ${e.second}")
    }
}