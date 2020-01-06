package algorithms.search.e002_A_Star

import kotlin.math.pow

data class Node(var parent: Node? = null, val pos: Pair<Int, Int>? = null) {
    var f = 0
    var g = 0
    var h = 0

    fun updateValues(currentNode: Node, endNode: Node) {
        calculateG(currentNode)
        calculateH(endNode)
        calculateF()
    }

    private fun calculateF() {
        this.f = this.g + this.h
    }

    private fun calculateG(currentNode: Node) {
        this.g = currentNode.g + 1
    }

    private fun calculateH(endNode: Node) {
        if (this.pos != null && endNode.pos != null) {
            this.h = (this.pos.first - endNode.pos.first).toDouble().pow(2).toInt() +
                    (this.pos.second - endNode.pos.second).toDouble().pow(2).toInt()
        }
    }

    override fun equals(other: Any?): Boolean {
        return if (other !is Node) {
            false
        } else {
            if (this.pos == null || other.pos == null) {
                false
            } else {
                this.pos.first == other.pos.first && this.pos.second == other.pos.second
            }
        }
    }

    override fun hashCode(): Int {
        var result = parent?.hashCode() ?: 0
        result = 31 * result + (pos?.hashCode() ?: 0)
        result = 31 * result + f
        result = 31 * result + g
        result = 31 * result + h
        return result
    }
}