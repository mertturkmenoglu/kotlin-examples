package practice.e013_dsaproject

import java.io.File

fun main() {
    println("Enter file path: ")
    val filePath = readLine()?:""
    val wordList = ArrayList<Node>()

    File(filePath).forEachLine {
        wordList.add(Node(it, 0, null))
    }

    val mtr = createAdjacencyMatrix(wordList)

    mainLoop@ while (true) {
        printMenu()

        when (readLine()!!.toInt()) {
            1 -> printMatrix(mtr)
            2 -> checkNeighboursHandler(mtr, wordList)
            3 -> connectionHandler()
            4 -> bfsHandler(mtr, wordList)
            5 -> printNeighboursHandler(mtr, wordList)
            0 -> break@mainLoop
            else -> throw Exception("Wrong number")
        }
    }
}