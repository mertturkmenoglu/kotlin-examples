package algorithms.graph.e004_KruskalMST

typealias Edge = Pair<Int, Int>

class Graph(val n: Int) {
    private val parent = Array(n) { it }
    private val graph = ArrayList<Pair<Int, Edge>>()
    private val mst = ArrayList<Pair<Int, Edge>>()

    fun addWeightedEdge(u: Int, v: Int, w: Int) {
        graph.add(w to Edge(u, v))
    }

    private fun findSet(i: Int): Int {
        return if (i == parent[i]) i else findSet(parent[i])
    }

    private fun unionSet(u: Int, v: Int) {
        parent[u] = parent[v]
    }

    fun kruskal() {
        graph.sortBy { it.first }

        for (i in graph.indices) {
            val uRep = findSet(graph[i].second.first)
            val vRep = findSet(graph[i].second.second)

            if (uRep != vRep) {
                mst.add(graph[i])
                unionSet(uRep, vRep)
            }
        }
    }

    fun print() {
        println("Edge\t\tWeight")
        for (e in mst) {
            println("${e.second.first} - ${e.second.second} : ${e.first}")
        }
    }
}

fun main() {
    val g = Graph(6)

    g.addWeightedEdge(0, 1, 4)
    g.addWeightedEdge(0, 2, 4)
    g.addWeightedEdge(1, 2, 2)
    g.addWeightedEdge(1, 0, 4)
    g.addWeightedEdge(2, 0, 4)
    g.addWeightedEdge(2, 1, 2)
    g.addWeightedEdge(2, 3, 3)
    g.addWeightedEdge(2, 5, 2)
    g.addWeightedEdge(2, 4, 4)
    g.addWeightedEdge(3, 2, 3)
    g.addWeightedEdge(3, 4, 3)
    g.addWeightedEdge(4, 2, 4)
    g.addWeightedEdge(4, 3, 3)
    g.addWeightedEdge(5, 2, 2)
    g.addWeightedEdge(5, 4, 3)

    g.kruskal()

    g.print()
}