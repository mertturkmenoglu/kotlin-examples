package practice.e013_dsaproject

fun checkNeighbours(mtr: Array<Array<Boolean>>, first: Int, second: Int) = mtr[first][second]

fun checkNeighboursHandler(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>) = println("They are${if (checkNeighbours(mtr, getIndex(wordList, readLine()!!), getIndex(wordList, readLine()!!))) " " else " not "}neighbours")

fun printNeighbours(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>, index: Int) = wordList.forEachIndexed { i, node -> if (mtr[index][i]) println(node.word) }

fun connection(first: String, second: String) = first.take(5).toList().zip(second.take(5).toList()).count { it.first != it.second } < 2

fun connectionHandler() = println(if (connection(readLine()!!, readLine()!!)) "Same or one letter difference" else "More than one letter is different")

fun getIndex(wordList: ArrayList<Node>, string: String) = wordList.indexOfFirst { stringCompare(it.word, string) }

fun printMenu() = print("---------------------------------------------------------------\n1- Print Adjacency Matrix (First n element of connection matrix)\n2- areTheyNeighbours (Give two words from matrix)\n3- isDifferentOneLetter (Give any two words)\n4- isTransformable (Is there any path between given two words)\n5- printNeighbours (Print all 1-step transformations)\n0- Exit\n---------------------------------------------------------------\n")

fun printNeighboursHandler(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>) = printNeighbours(mtr, wordList, getIndex(wordList, readLine()!!))

fun stringCompare(str1: String, str2: String) = str1.take(5) === str2.take(5)