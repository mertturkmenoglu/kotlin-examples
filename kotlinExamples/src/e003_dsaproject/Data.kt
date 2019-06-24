package e003_dsaproject

import java.lang.Exception

data class Node(val word: String = "", var level: Int = 0, var parent: Node? = null)

data class Path(val path: Array<Int>, val n: Int, val step: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Path

        if (!path.contentEquals(other.path)) return false
        if (n != other.n) return false
        if (step != other.step) return false

        return true
    }

    override fun hashCode(): Int {
        var result = path.contentHashCode()
        result = 31 * result + n
        result = 31 * result + step
        return result
    }
}

class Queue<T>(private val capacity: Int = 10) {
    private val elements: ArrayList<T> = ArrayList(capacity)
    private var size: Int = 0

    fun enqueue(element: T): Boolean {
        if (isFull()) {
            throw Exception("Queue is full")
        } else {
            elements.add(element)
            size++
            return true
        }
    }

    fun dequeue(): T {
        if (isEmpty()) {
            throw Exception("Queue is empty")
        } else {
            val value = elements[0]
            elements.removeAt(0)
            size--
            return value
        }
    }

    private fun isFull() = (size == capacity)
    fun isEmpty() = (size == 0)
}