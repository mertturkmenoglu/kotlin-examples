package collections.list.e002_ArrayList

import kotlin.random.Random

fun main() {
    val numbers = ArrayList<Int>()
    val names = ArrayList<String>()
    names.add("Emily")
    names.add("Diana")
    names.add("Barbara")
    names.add("Selina")
    names.add("Raven")

    repeat(5) {
        numbers.add(Random.nextInt(-5, 40))
    }

    println(numbers)
    println(names)

    println(numbers.all { it > 0 })
    println(numbers.any { it > 10 })
    println(numbers.binarySearch(3))
    println(numbers.count { num -> num == 5 })

    @Suppress("SpellCheckingInspection")
    val tmpNums = ArrayList<Int>()

    numbers.forEach {
        tmpNums.add(it)
    }
    println("tmp: $tmpNums")

    numbers.fill(0)
    println("Numbers: $numbers")

    numbers.clear()

    tmpNums.forEach {
        numbers.add(it)
    }
    println("Numbers: $numbers")

    println("Array: ${numbers.toArray().asList()}")
    println("Sum: ${numbers.sum()}")

    numbers.reverse()
    println("$numbers")

    println(numbers.filter { it > 0 })
    println("$numbers")

    println(names.find { it === "Raven" })
    println(numbers.filter { it > 0 }.joinToString("", "", ""))
    println(names.random())
}