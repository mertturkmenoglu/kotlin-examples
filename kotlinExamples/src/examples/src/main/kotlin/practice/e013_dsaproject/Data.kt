package practice.e013_dsaproject

data class Node(val word: String = "", var level: Int = 0, var parent: Node? = null)

@Suppress("ArrayInDataClass")
data class Path(val path: Array<Int>, val n: Int, val step: Int)

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