package languageExamples.e023_Queue

fun main() {
    val q = Queue<Int>(5)
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)

    println(q)

    try {
        q.enqueue(6)
    } catch (e: Exception) {
        println(e.message)
    }

    q.dequeue()
    q.dequeue()
    println(q)
    q.dequeue()
    q.dequeue()
    println(q)
    q.dequeue()

    try {
        q.dequeue()
    } catch (e: Exception) {
        println(e.message)
    }
}