package languageExamples.e002_InfixNotation

import kotlin.random.Random

fun main() {
    val age = Random.nextInt(10, 30)
    val isSingle = Random.nextBoolean()

    val result = (age < 18) or isSingle
    println("Age: $age\tisSingle: $isSingle")
    println(if (result) "Can't enter" else "Can enter")

    val person1 = Bool(true)
    val person2 = Bool(false)

    print(person1 or person2)
}

class Bool(var value: Boolean = false) {
    infix fun or(other: Bool): Boolean {
        return value or other.value
    }
}