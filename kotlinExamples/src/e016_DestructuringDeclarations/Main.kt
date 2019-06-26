package e016_DestructuringDeclarations

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
}