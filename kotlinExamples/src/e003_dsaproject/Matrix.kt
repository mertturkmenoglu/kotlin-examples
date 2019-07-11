package e003_dsaproject

fun createAdjacencyMatrix(wordList: ArrayList<Node>) = Array(wordList.size) { Array(wordList.size) {false} }.also {
    it.forEachIndexed { i, row ->
        row.forEachIndexed { j, _ ->
            row[j] = (if (i == j) false else connection(wordList[i].word, wordList[j].word))
        }
    }
}

fun <T> printMatrix(mtr: Array<Array<T>>) = mtr.forEach { row -> row.forEach { e -> print(if (e == true) 1 else 0) } }