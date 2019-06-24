package e003_dsaproject


fun checkNeighbours(mtr: Array<Array<Boolean>>, first: Int, second: Int) = mtr[first][second]


fun checkNeighboursHandler(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>) {
    println("Enter your first word: ")
    val first = readLine()!!

    println("Enter your second word: ")
    val second = readLine()!!

    val firstIndex = getIndex(wordList, first)
    val secondIndex = getIndex(wordList, second)

    if ((firstIndex == -1) or (secondIndex == -1)) {
        throw Exception("Invalid input")
    }

    val result = checkNeighbours(mtr, firstIndex, secondIndex)

    if (result) {
        println("$first and $second are neighbours")
    } else {
        println("$first and $second are not neighbours")
    }
}


fun printNeighbours(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>, index: Int) {
    val wordCount = wordList.size

    for (i in 0 until wordCount) {
        if (mtr[index][i]) {
            println(wordList[i].word)
        }
    }
}


fun connection(first: String, second: String): Boolean {
    val actualLen = 5
    var i = 0
    var counter = 0

    while ((i < actualLen) and (counter < 2)) {
        if (first[i] != second[i]) {
            counter++
        }
        i++
    }

    return (counter < 2)
}


fun connectionHandler() {
    println("Enter your first word")
    val first = readLine()!!

    println("Enter your second word")
    val second = readLine()!!

    val result = connection(first, second)

    if (result) {
        println("Same or one letter difference")
    } else {
        println("More than one letter is different")
    }
}


fun getIndex(wordList: ArrayList<Node>, string: String): Int {
    for (node in wordList) {
        val result = stringCompare(node.word, string)

        if (result)
            return wordList.indexOf(node)
    }

    return -1
}


fun printMenu() {
    print("---------------------------------------------------------------\n")
    print("1- Print Adjacency Matrix (First n element of connection matrix)\n")
    print("2- areTheyNeighbours (Give two words from matrix)\n")
    print("3- isDifferentOneLetter (Give any two words)\n")
    print("4- isTransformable (Is there any path between given two words)\n")
    print("5- printNeighbours (Print all 1-step transformations)\n")
    print("0- Exit\n")
    print("---------------------------------------------------------------\n")
}


fun printNeighboursHandler(mtr: Array<Array<Boolean>>, wordList: ArrayList<Node>) {
    println("Enter your word")
    val string = readLine()!!

    val index = getIndex(wordList, string)

    if (index == -1)
        throw Exception("Invalid word")

    printNeighbours(mtr, wordList, index)
}


fun stringCompare(str1: String, str2: String): Boolean {
    var i = 0
    val actualLen = 5

    while (i < actualLen) {
        if (str1[i] == str2[i])
            i++
        else
            break
    }

    return i == actualLen
}