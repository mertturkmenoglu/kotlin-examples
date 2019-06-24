package e003_dsaproject

fun createAdjacencyMatrix(wordList: ArrayList<Node>): Array<Array<Boolean>> {
    val lineCount = wordList.size
    val mtr =  Array(lineCount) { Array(lineCount) {false} }

    for (i in 0 until lineCount) {
        for (j in 0 until lineCount) {
            mtr[i][j] = if (i == j) false else connection(wordList[i].word, wordList[j].word)
            mtr[j][i] = mtr[i][j]
        }
    }

    return mtr
}


fun <T> printMatrix(mtr: Array<Array<T>>) {
    for (row in mtr) {
        for (e in row) {
            print(e)
        }
        println()
    }
}