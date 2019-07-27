package practice.e026_BFS

fun main() {
    val graph = Graph<String>(4)

    graph.addNode(Node(0, "A"))
    graph.addNode(Node(1, "B"))
    graph.addNode(Node(2, "C"))
    graph.addNode(Node(3, "D"))

    graph.addConnection(0, 1)
    graph.addConnection(0, 2)
    graph.addConnection(1, 2)
    graph.addConnection(2, 3)

    graph.printGraph()

    val path = bfs(graph, 0, 3)

    path?.forEach {
        println(it.value)
    }
}