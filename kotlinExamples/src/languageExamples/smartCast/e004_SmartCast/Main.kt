package languageExamples.smartCast.e004_SmartCast

fun main() {
    val s = Squirrel()
    val c = Cat()
    val str = "Emily"

    smart(s)
    smart(c)
    smart(str)
}

fun smart(x: Any) = when (x) {
    is Squirrel -> {
        println(x.getAnimalName())
        x.makeSound()
        x.specialSquirrelFunction()
    }
    is Cat -> {
        println(x.getAnimalName())
        x.makeSound()
        x.catFunction()
    }
    else -> println("$x is not an animal")
}