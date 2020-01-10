package practice.problemSolving.e066_BinarySearchTree

import java.io.File

data class Person(var id: Int, val name: String, val friends: ArrayList<Int>?)

data class Node(val value: Person, var leftNode: Node?, var rightNode: Node?) {
    override fun toString() = StringBuilder().apply {
        append("========\nId: ${value.id}\nName: ${value.name}\nFriends: \n")
        value.friends?.forEach { append("$it ") }
        append("\n========\n")
    }.toString()
}

fun main() {
    var root: Node? = null

    while (true) {
        printMenu()
        println("Enter your choice: ")
        val choice = readLine()?.toInt() ?: throw Exception()

        if (choice !in 0..10)
            println("Invalid input")

        if (choice == 0)
            break

        root = caseHandler(root, choice)
    }
}

fun printMenu() {
    println("1. Add a new user to tree manually(manualInput)")
    println("2. Add users from a file(importFromFile)")
    println("3. Delete a user from tree(deleteUser)")
    println("4. Search for a user(contains)")
    println("5. Print friends of a user(friends)")
    println("6. Print user count(size)")
    println("7. printNext")
    println("8. printGreater")
    println("9. printInOrder")
    println("0. Exit")
    println("---------------\n")
}

fun caseHandler(root: Node?, choice: Int): Node? {
    return when (choice) {
        1 -> manualInput(root)
        2 -> importFromFile(root)
        3 -> deleteUserHandler(root)
        4 -> containsHandler(root)
        5 -> friendsHandler(root)
        6 -> println(size(root)).let { root }
        7 -> printNextHandler(root)
        8 -> printGreaterHandler(root)
        9 -> printInOrder(root).let { root }
        else -> null
    }
}

fun createNewUser(id: Int, name: String, friends: List<Int>?) =
        Node(Person(id, name, friends?.let { ArrayList(friends) }), null, null)

fun search(root: Node?, id: Int): Node? {
    if (root == null) return null
    if (root.value.id == id) return root
    if (root.value.id < id) return search(root.rightNode, id)
    return search(root.leftNode, id)
}

fun parseString(inp: String): Node {
    val parts = inp.split(",")
    val friends = if (parts.size == 3) {
        parts[2].split("-").map { it.toInt() }
    } else {
        null
    }

    return createNewUser(parts[0].toInt(), parts[1], friends)
}

fun importFromFile(root: Node?): Node? {
    var r = root

    println("Enter file path: ")
    val path = readLine() ?: throw Exception()
    var userCount = 0

    File(path).forEachLine {
        val tmp = parseString(it)
        if (search(r, tmp.value.id) == null) {
            r = insertToTree(r, tmp)
            userCount++
            if (userCount % 10 == 0) printInOrder(r)
        }
    }

    return r
}

fun friends(root: Node?, id: Int): Unit? = search(root, id)?.run {
    value.friends?.forEach { printUserInfo(search(root, it)) }
}

fun insertToTree(root: Node?, user: Node?): Node? {
    if (root == null) return user
    if (user == null) throw Exception()

    if (user.value.id < root.value.id) {
        root.leftNode = insertToTree(root.leftNode, user)
    } else if (user.value.id > root.value.id) {
        root.rightNode = insertToTree(root.rightNode, user)
    }

    return root
}

fun manualInput(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    if (search(root, id) == null) {
        println("Enter user name: ")
        val name = readLine() ?: throw Exception()

        println("Enter friend count: ")
        val c = readLine()?.toInt() ?: throw Exception()

        val l = ArrayList<Int>()
        repeat(c) {
            println("Enter friend id: ")
            val tmp = readLine()?.toInt() ?: throw Exception()
            l.add(tmp)
        }

        val tmp = insertToTree(root, createNewUser(id, name, l))
        if (root == null) return tmp
    }

    return root
}

fun size(root: Node?): Int = if (root == null) {
    0
} else {
    size(root.rightNode) + size(root.leftNode) + 1
}

fun deleteUserHandler(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    return if (search(root, id) != null) deleteUser(root, id) else root
}

fun deleteUser(root: Node?, id: Int): Node? {
    if (root == null) return null

    when {
        id < root.value.id -> root.leftNode = deleteUser(root.leftNode, id)
        id > root.value.id -> root.rightNode = deleteUser(root.rightNode, id)
        else -> {
            if (root.leftNode == null) {
                return root.rightNode
            } else if (root.rightNode == null) {
                return root.rightNode
            }

            val tmp = findMinimumValueNode(root.rightNode)
            root.value.id = tmp?.value?.id!!
            root.rightNode = deleteUser(root.rightNode, tmp.value.id)
        }
    }

    return root
}

fun findMinimumValueNode(root: Node?): Node? {
    var curr = root
    while (curr?.leftNode != null) {
        curr = curr.leftNode
    }
    return curr
}

fun containsHandler(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    search(root, id)?.let { printUserInfo(it) }

    return root
}

fun friendsHandler(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    search(root, id)?.let { friends(root, id) }

    return root
}

fun printNextHandler(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    search(root, id)?.let { printInOrder(it) }

    return root
}

fun printInOrder(root: Node?): Unit? = root?.let {
    printInOrder(root.leftNode)
    printUserInfo(root)
    printInOrder(root.rightNode)
}

fun printGreaterHandler(root: Node?): Node? {
    println("Enter user id: ")
    val id = readLine()?.toInt() ?: throw Exception()

    search(root, id)?.let { printGreater(root, id) }

    return root
}

fun printGreater(root: Node?, id: Int): Unit? = root?.let {
    printGreater(root.leftNode, id)
    if (root.value.id > id)
        printUserInfo(root)
    printGreater(root.rightNode, id)
}

fun printUserInfo(root: Node?) = println(root.toString())