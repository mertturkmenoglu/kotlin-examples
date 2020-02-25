package other.e002_DestructuringDeclarations

import kotlin.random.Random

data class Person(var name: String, var age: Int)

fun createString(len: Int): String {
    val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..len).map { Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("")
}

fun main() {
    val person = Person(createString(10), Random.nextInt(7, 70))
    println(person.name)
    println(person.age)

    val (name, age) = person
    println(name)
    println(age)

    val arr = arrayListOf(3, 4, 5, 6, 7)

    val iterator = arr.iterator()
    for ((index, element) in iterator.withIndex()) {
        println("A[$index]: $element")
    }
}