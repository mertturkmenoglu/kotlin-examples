package languageExamples.oop.e009_ClassDelegation

// Base class
interface Animal {
    fun eat()
}

// Let's implement the interface
class Squirrel(val name: String) : Animal {
    override fun eat() {
        println("$name eats fresh flowers")
    }
}

// This class takes an object and inherits from the Animal class
// over the object
class AnatolianSquirrel(s: Squirrel) : Animal by s

fun main() {
    val sq = Squirrel("Alf")
    sq.eat()

    val alf = AnatolianSquirrel(sq)
    alf.eat()
}