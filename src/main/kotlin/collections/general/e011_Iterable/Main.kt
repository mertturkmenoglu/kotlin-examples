package collections.general.e011_Iterable

private class MyCollection<T> : Iterable<T> {
    private val values = ArrayList<T>()

    fun append(e: T): Boolean {
        return this.values.add(e)
    }

    override fun iterator(): Iterator<T> {
        return this.values.iterator()
    }
}

// Driver code
fun main() {
    val myCollection = MyCollection<String>()

    myCollection.append("Emily")
    myCollection.append("Diana")
    myCollection.append("Barbara")

    for (e in myCollection) {
        println(e)
    }

    println("--------")

    val iterator = myCollection.iterator()
    while (iterator.hasNext()) {
        val curr = iterator.next()
        println(curr)
    }

    println("--------")

    myCollection.forEach(::println)
}