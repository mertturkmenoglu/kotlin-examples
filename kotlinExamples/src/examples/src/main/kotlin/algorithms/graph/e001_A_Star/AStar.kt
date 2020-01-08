package algorithms.graph.e001_A_Star

import kotlin.math.pow

fun aStar(grid: List<List<Int>>, start: Pair<Int, Int>, end: Pair<Int, Int>): List<Pair<Int, Int>>? {
    val startNode = Node(null, start)
    val endNode = Node(null, end)

    val openList = mutableListOf<Node>()
    val closedList = mutableListOf<Node>()

    openList.add(startNode)
    var loop = 0
    val maxLoopCount = (grid.size / 2).toDouble().pow(10).toInt()

    while (openList.isNotEmpty() && loop < maxLoopCount) {
        loop++

        // Find minimum cost node on open list
        val currentNode = openList.minBy { it.f } ?: throw Exception()
        val currentIndex = openList.indexOf(currentNode)

        openList.removeAt(currentIndex)
        closedList.add(currentNode)

        // Is there a path?
        if (currentNode == endNode) {
            val path = mutableListOf<Pair<Int, Int>>()
            var curr: Node? = currentNode

            while (curr != null) {
                curr.pos?.let { path.add(it) }
                curr = curr.parent
            }

            return path.reversed()
        }

        val children = mutableListOf<Node>()
        val moves = listOf(0 to -1, 0 to 1, -1 to 0, 1 to 0)

        for (move in moves) {
            if (currentNode.pos != null) {
                val nodePos = currentNode.pos.first + move.first to currentNode.pos.second + move.second
                if (!isValidMove(grid, nodePos)) {
                    continue
                }

                children.add(Node(currentNode, nodePos))
            }
        }

        for (child in children) {
            if (child in closedList) {
                continue
            }

            child.updateValues(currentNode, endNode)

            for (openNode in openList) {
                if (child == openNode && child.g > openNode.g) {
                    continue
                }
            }

            openList.add(child)
        }
    }

    return null
}

private fun isValidMove(grid: List<List<Int>>, nodePos: Pair<Int, Int>): Boolean {
    val rowCount = grid.size
    val colCount = grid[0].size

    if (((nodePos.first > rowCount - 1) || (nodePos.first < 0) || (nodePos.second > colCount - 1) ||
                    (nodePos.second < 0)) || (grid[nodePos.first][nodePos.second] != 0))
        return false

    return true
}