package practice.e023_Queue

class Queue<T>(private val capacity: Int = 10) {
    private val values: ArrayList<T> = ArrayList(capacity)
    private var size: Int = 0

    fun enqueue(element: T) {
        if (!isFull()) {
            values.add(element)
            size++
        } else {
            throw Exception("Queue is full")
        }
    }

    fun dequeue(): T {
        if (!isEmpty()) {
            size--
            return values.removeAt(values.lastIndex)
        } else {
            throw Exception("Queue is empty")
        }
    }

    override fun toString(): String {
        return values.toString()
    }

    private fun isFull() = (size == capacity)

    fun isEmpty() = (size == 0)
}