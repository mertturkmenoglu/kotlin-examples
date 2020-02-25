package collections.general.e010_Iterator

data class Person(val name: String, val age: Int)

// Driver code
fun main() {
    val people = listOf(
            Person("Emily", 35),
            Person("Diana", 27),
            Person("Barbara", 19),
            Person("Bruce", 23),
            Person("Clark", 37)
    )

    val listIterator = people.iterator()

    while (listIterator.hasNext()) {
        val person = listIterator.next()
        println(person)
    }

    println("--------")

    val map = people
            .associateBy { it.age }
            .toMutableMap()
    val mapIterator = map.iterator()

    while (mapIterator.hasNext()) {
        val curr = mapIterator.next()

        // New addition to collection will throw
        // java.util.ConcurrentModificationException

        // Remove operation will not break the sync
        // between the iterator and the collection

        if (curr.value.name == "Emily") {
            mapIterator.remove()
        }
    }

    map.forEach(::println)
}