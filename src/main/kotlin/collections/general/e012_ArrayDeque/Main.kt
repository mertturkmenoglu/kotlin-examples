package collections.general.e012_ArrayDeque

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val deque = ArrayDeque<String>()

    deque.addLast("Diana")
    deque.addLast("Barbara")
    deque.addFirst("Emily")

    println(deque)

    deque.removeFirst()
    deque.removeLast()

    println(deque)
}
