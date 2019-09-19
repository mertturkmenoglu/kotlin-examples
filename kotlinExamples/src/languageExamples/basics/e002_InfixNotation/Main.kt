package languageExamples.basics.e002_InfixNotation

import kotlin.random.Random

/**
 * Example 002: Kotlin Infix Functions
 *
 * Demonstrating how infix functions work.
 *
 * @see Random
 *
 * Reference:
 * https://kotlinlang.org/docs/reference/functions.html#infix-notation
 */
fun main() {
    // Get random values for age and relationship status
    val age = Random.nextInt(10, 30)
    val isSingle = Random.nextBoolean()

    // Here we us built-in type Boolean infix function or
    val result = (age < 18) or isSingle
    println("Age: $age\tisSingle: $isSingle")
    println(if (result) "Can't enter" else "Can enter")

    // Now create our type objects
    val person1 = Bool(true)
    val person2 = Bool(false)

    // We could call person1.or(person2)
    print(person1 or person2)
}
