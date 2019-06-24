package e003_dsaproject

fun bfs(matrix: Array<Array<Boolean>>, wordList: ArrayList<Node>, start: Int, end: Int): Path? {
    for (word in wordList) {
        word.level = 0
        word.parent = null
    }

    val q = Queue<Node>(5000)
    q.enqueue(wordList[start])

    val visited = Array(wordList.size) { false }
    visited[start] = true

    while (!q.isEmpty()) {
        var v: Node? = q.dequeue()
        val result = stringCompare(wordList[end].word, v?.word?:"")

        if (result) {
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

        for (i in 0 until wordList.size) {
            if (matrix[index][i] and !visited[i]) {
                visited[i] = true
                wordList[i].level = v.level + 1
                wordList[i].parent = v
                q.enqueue(wordList[i])
            }
        }
    }

    return null
}


fun bfsHandler(matrix: Array<Array<Boolean>>, wordList: ArrayList<Node>) {
    println("Enter your first word")
    val first = readLine()!!

    println("Enter your second word")
    val second = readLine()!!

    val start = getIndex(wordList, first)
    val end = getIndex(wordList, second)

    if ((start == -1) or (end == -1)) {
        throw Exception("Invalid input")
    }


    val result = bfs(matrix, wordList, start, end)
    if (result != null) {
        println("There is a transformation between $first and $second: ${result.step} steps")
        for (i in 0 until result.n) {
            println(wordList[result.path[i]].word)
        }
    } else {
        println("There is no transformation between $first and $second")

        println("--------------------------\n\n")
    }
}
