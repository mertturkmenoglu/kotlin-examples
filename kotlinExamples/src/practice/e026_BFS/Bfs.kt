package practice.e026_BFS

import practice.e023_Queue.Queue

data class Node<T>(val id: Int = 0, val value: T, var parent: Node<T>? = null) {
    override fun toString() = "$id $value $parent"
}

class Graph<T>(val n: Int) {
    val adjList = Array<ArrayList<Int>>(n) {ArrayList(n) }
    val nodeList = ArrayList<Node<T>>(n)

    fun printGraph() {
        for (e in adjList) {
            for (i in e) {
                print(i)
                print("\t")
            }
            println()
        }
        for (e in nodeList) {
            println(e)
        }
    }

    fun addNode(node: Node<T>) {
        nodeList.add(node)
    }

    fun addConnection(firstID: Int, secondID: Int) {
        adjList[firstID].add(secondID)
        adjList[secondID].add(firstID)
    }

    @Suppress("unused")
    fun addConnection(connection: Pair<Node<T>, Node<T>>) {
        adjList[connection.first.id].add(connection.second.id)
    }
}

fun <T> bfs(g: Graph<T>, start: Int, end: Int) = bfs(g, g.nodeList[start], g.nodeList[end])


fun <T> bfs(g: Graph<T>, start: Node<T>, end: Node<T>): ArrayList<Node<T>>? {
    for (node in g.nodeList) {
        node.parent = null
    }

    val q = Queue<Node<T>>(g.n)
    q.enqueue(start)

    val visited = Array(g.n) { false }
    visited[start.id] = true

    while (! q.isEmpty() ) {
        val u = q.dequeue()

        if (u.id == end.id) {
            val path = ArrayList<Node<T>>()
            var v: Node<T>? = u

            while (true) {
                if (v == null) {
                    break
                }
                path.add(v)
                v = v.parent
            }

            path.reverse()
            return path
        }

        for (neighbour in g.adjList[u.id]) {
            if (!visited[neighbour]) {
                visited[neighbour] = true
                g.nodeList[neighbour].parent = u
                q.enqueue(g.nodeList[neighbour])
            }
        }
    }

    return null
}

