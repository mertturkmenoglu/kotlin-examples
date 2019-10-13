package practice.e024_LinkedList

@Suppress("unused", "all")
open class LinkedList<E> {
    private data class Node<E> internal constructor(
            internal var prev: Node<E>?,
            internal var item: E?,
            internal var next: Node<E>?
    )

    // Variables
    private var size = 0
    private var first: Node<E>? = null
    private var last: Node<E>? = null

    // Private methods
    private fun linkFirst(e: E) {
        val f = first
        val newNode = Node(null, e, f)
        first = newNode

        if (f == null)
            last = newNode
        else
            f.prev = newNode

        size++
    }

    private fun linkLast(e: E?) {
        val l = last
        val newNode = Node(l, e, null)
        last = newNode

        if (l == null)
            first = newNode
        else
            l.next = newNode

        size++
    }

    private fun linkBefore(e: E?, successor: Node<E>) {
        val predecessor = successor.prev
        val newNode = Node(predecessor, e, successor)

        successor.prev = newNode

        if (predecessor == null)
            first = newNode
        else
            predecessor.next = newNode

        size++
    }

    private fun unlinkFirst(f: Node<E>): E? {
        val element = f.item
        val next = f.next

        f.item = null
        f.next = null
        first = next

        if (next == null)
            last = null
        else
            next.prev = null

        size--

        return element
    }

    private fun unlinkLast(l: Node<E>): E? {
        val element = l.item
        val prev = l.prev

        l.item = null
        l.prev = null
        last = prev

        if (prev == null)
            first = null
        else
            prev.next = null

        size--

        return element
    }

    private fun unlink(x: Node<E>): E? {
        val element = x.item
        val next = x.next
        val prev = x.prev

        if (prev == null) {
            first = next
        } else {
            prev.next = next
            x.prev = null
        }

        if (next == null) {
            last = prev
        } else {
            next.prev = prev
            x.next = null
        }

        x.item = null
        size--

        return element
    }

    private fun node(index: Int): Node<E>? {
        return if (index < size shr 1) {
            var node = first
            for (i in 0 until index)
                node = node!!.next
            node
        } else {
            var node = last
            for (i in size - 1 downTo index + 1)
                node = node!!.prev
            node
        }
    }

    // Public methods
    fun getFirst() = first!!.copy().item

    fun getLast() = last!!.copy().item

    fun removeFirst() = unlinkFirst(first!!.copy())

    fun removeLast() = unlinkLast(last!!.copy())

    fun addFirst(e: E) = linkFirst(e)

    fun addLast(e: E) = linkLast(e)

    operator fun contains(o: Any?) = indexOf(o) >= 0

    fun size() = size

    fun add(e: E?) = linkLast(e)

    fun remove(o: Any?): Boolean {
        var curr = first

        while (curr != null) {
            if (o == curr.item) {
                unlink(curr)
                return true
            }
            curr = curr.next
        }

        return false
    }

    fun clear() {
        var x = first

        while (x != null) {
            val next = x.next
            x.item = null
            x.next = null
            x.prev = null
            x = next
        }

        last = null
        first = last
        size = 0
    }

    fun get(index: Int) = node(index)!!.item

    fun set(index: Int, element: E?): E? {
        val curr = node(index)
        val oldVal = curr!!.item
        curr.item = element

        return oldVal
    }

    fun remove(index: Int) = unlink(node(index)!!)

    fun indexOf(obj: Any?): Int {
        var index = 0
        var curr = first

        while (curr != null) {
            if (obj == curr.item) {
                return index
            }

            index++
            curr = curr.next
        }

        return -1
    }

    fun printList() {
        var curr = first
        while (curr != null) {
            print(curr.item)
            print("\t")
            curr = curr.next
        }
        println()
    }
}
