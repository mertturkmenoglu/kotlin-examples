package practice.e089_dsaproject

import java.io.File
import java.io.IOException

fun main() {
    println("Enter file path: ")

    val wordList = File(readLine() ?: throw IOException()).readLines().map { Node(it, 0, null) }
    val mtr = createAdjacencyMatrix(wordList)

    mainLoop@ while (true) {
        printMenu()
        when (readLine()!!.toInt()) {
            1 -> printMatrix(mtr)
            2 -> checkNeighboursHandler(mtr, wordList)
            3 -> connectionHandler()
            4 -> bfsHandler(mtr, wordList)
            5 -> printNeighboursHandler(mtr, wordList)
            else -> break@mainLoop
        }
    }
}

data class Node(val word: String = "", var level: Int = 0, var parent: Node? = null)
data class Path(val path: MutableList<Int>, val n: Int, val step: Int)

fun createAdjacencyMatrix(w: List<Node>) = List(w.size) { i -> List(w.size) { j -> connection(w[i].word, w[j].word) } }

fun <T> printMatrix(mtr: List<List<T>>) = mtr.forEach { println(it.map { e -> if (e == true) 1 else 0 }) }

fun checkNeighboursHandler(mtr: List<List<Boolean>>, w: List<Node>) = println("They are${if (mtr[getIndex(w, readLine() ?: throw Exception())][getIndex(w, readLine() ?: throw Exception())]) " " else " not "}neighbours")

fun printNeighbours(mtr: List<List<Boolean>>, w: List<Node>, index: Int) = w.forEachIndexed { i, node -> if (mtr[index][i]) println(node.word) }

fun connection(fst: String, snd: String) = fst.take(5).zip(snd.take(5)).count { it.first != it.second } < 2

fun connectionHandler() = println(if (connection(readLine()!!, readLine()!!)) "Same or one letter difference" else "More than one letter is different")

fun getIndex(w: List<Node>, str: String) = w.indexOfFirst { it.word == str }

fun printMenu() = print("---------------------------------------------------------------\n1- Print Adjacency Matrix (First n element of connection matrix)\n2- areTheyNeighbours (Give two words from matrix)\n3- isDifferentOneLetter (Give any two words)\n4- isTransformable (Is there any path between given two words)\n5- printNeighbours (Print all 1-step transformations)\n0- Exit\n---------------------------------------------------------------\n")

fun printNeighboursHandler(mtr: List<List<Boolean>>, w: List<Node>) = printNeighbours(mtr, w, getIndex(w, readLine()!!))

fun bfs(mtr: List<List<Boolean>>, w: List<Node>, start: Int, end: Int): Path? {
    w.forEach { it.level = 0; it.parent = null }

    val q = mutableListOf(w[start])
    val visited = MutableList(w.size) { false }.apply { set(start, true) }

    while (q.isNotEmpty()) {
        var v: Node? = q.removeAt(0)

        if (w[end].word == v?.word ?: throw Exception()) {
            val path = Path(MutableList(v.level + 1) { -1 }, v.level + 1, v.level)

            while (v != null) {
                path.path.add(getIndex(w, v.word))
                v = v.parent
            }

            return path.apply { path.path.reverse() }
        }

        for ((i, node) in w.withIndex()) {
            if (mtr[getIndex(w, v.word)][i] && !visited[i]) {
                visited[i] = true
                q.add(node.apply { level = v.level; parent = v })
            }
        }
    }

    return null
}

fun bfsHandler(mtr: List<List<Boolean>>, w: List<Node>) {
    bfs(mtr, w, getIndex(w, readLine()!!), getIndex(w, readLine()!!))?.path?.map { w[it].word }?.forEach(::println)
    println("--------------------------\n\n")
}