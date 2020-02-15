package algorithms.graph.e002_Dijkstra

import java.util.*

@Suppress("unused")
class Graph(private val edges: MutableList<Edge>) {
    private fun getVertices(): Set<String> {
        return edges.map { it.start }.toSet() + edges.map { it.end }.toSet()
    }

    private fun getNodePairs(n1: String, n2: String, both: Boolean = true): List<List<String>> {
        return if (both) listOf(listOf(n1, n2), listOf(n2, n1)) else listOf(listOf(n1, n2))
    }

    fun removeEdge(n1: String, n2: String, both: Boolean = true) {
        edges.forEach { if (listOf(it.start, it.end) in getNodePairs(n1, n2, both)) edges.remove(it) }
    }

    fun addEdge(n1: String, n2: String, cost: Int = 1, both: Boolean = true) {
        if (edges.any { listOf(it.start, it.end) in getNodePairs(n1, n2, both) }) {
            throw Exception()
        }

        edges.add(Edge(n1, n2, cost))
        if (both) {
            edges.add(Edge(n2, n1, cost))
        }
    }

    private fun neighbours(): MutableMap<String, Set<Pair<String, Int>>> {
        val n = mutableMapOf<String, Set<Pair<String, Int>>>()

        for (v in getVertices()) {
            n[v] = mutableSetOf()
        }

        for (e in edges) {
            n.replace(e.start, n.getOrDefault(e.start, mutableSetOf()) + (e.end to e.cost))
        }

        return n
    }

    fun dijkstra(src: String, dest: String): Pair<List<String>, Int> {
        require(src in getVertices()) { "Source node does not exist" }

        val distances = getVertices().associateWith { Int.MAX_VALUE }.toMutableMap()
        val prevVertices = getVertices().associateWith { "" }.toMutableMap()

        distances[src] = 0
        val ver = getVertices().toMutableList()

        while (ver.isNotEmpty()) {
            val curr = ver.minBy { distances[it] ?: throw Exception() } ?: throw Exception()
            ver.remove(curr)

            if (distances[curr] == Int.MAX_VALUE) {
                break
            }

            for ((n, cost) in neighbours()[curr] ?: throw Exception()) {
                val alt = distances.getOrDefault(curr, 0) + cost

                if (alt < distances[n] ?: throw Exception()) {
                    distances[n] = alt
                    prevVertices[n] = curr
                }
            }
        }

        val path = LinkedList<String?>()
        var curr: String? = dest

        while (prevVertices[curr] != null) {
            path.addFirst(curr)
            curr = prevVertices[curr]
        }

        val p = path.filterNotNull()
        val cost = p.zipWithNext().sumBy { e ->
            (edges.find { it.start == e.first && it.end == e.second } ?: throw Exception()).cost
        }

        return p to cost
    }
}