package practice.e013_dsaproject

fun bfs(matrix: Array<Array<Boolean>>, wordList: ArrayList<Node>, start: Int, end: Int): Path? {
    wordList.forEach { it.level = 0; it.parent = null }

    val q = Queue<Node>(5000)
    q.enqueue(wordList[start])

    val visited = Array(wordList.size) { false }
    visited[start] = true

    while (!q.isEmpty()) {
        var v: Node? = q.dequeue()

        if (stringCompare(wordList[end].word, v?.word ?: "")) {
            val path = Path(Array(v!!.level + 1) { -1 }, v.level + 1, v.level)

            var j = v.level

            while (true) {
                if (v == null) {
                    break
                }
                path.path[j--] = getIndex(wordList, v.word)
                v = v.parent
            }

            return path
        }

        val index = getIndex(wordList, v!!.word)

        wordList.forEachIndexed { i, node ->
            if (matrix[index][i] && !visited[i]) {
                visited[i] = true
                node.level = v.level + 1
                node.parent = v
                q.enqueue(node)
            }
        }
    }

    return null
}


fun bfsHandler(matrix: Array<Array<Boolean>>, wordList: ArrayList<Node>) {
    val result = bfs(matrix, wordList, getIndex(wordList, readLine()!!), getIndex(wordList, readLine()!!))
    if (result != null) {
        println("There is a transformation between words: ${result.step} steps")
        result.path.forEach { println(wordList[it].word) }
    } else {
        println("There is no transformation between words")
        println("--------------------------\n\n")
    }
}
