package e024_LinkedList

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.add(1)
    linkedList.add(2)
    linkedList.printList()

    linkedList.add(3)
    linkedList.add(null)
    linkedList.add(5)
    linkedList.printList()

    var tmp = linkedList.get(2)
    println(tmp)
    tmp = linkedList.get(0)
    println(tmp)

    linkedList.addFirst(0)
    linkedList.printList()

    println(linkedList.contains(4))

    tmp = linkedList.remove(1)
    println(tmp)
    linkedList.printList()

    println(linkedList.indexOf(5))

    tmp = linkedList.removeFirst()
    println(tmp)
    linkedList.printList()

    linkedList.set(1, 100)
    linkedList.printList()

    linkedList.clear()
    linkedList.printList()
}