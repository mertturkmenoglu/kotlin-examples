package algorithms.graph.e002_Dijkstra

fun main() {
    val g = Graph(mutableListOf(
            Edge("a", "b", 7),
            Edge("a", "c", 9),
            Edge("a", "f", 14),
            Edge("b", "c", 10),
            Edge("b", "d", 15),
            Edge("c", "d", 11),
            Edge("c", "f", 2),
            Edge("d", "e", 6),
            Edge("e", "f", 9)))

    val (path, cost) = g.dijkstra("a", "e")
    println(path)
    println(cost)
}