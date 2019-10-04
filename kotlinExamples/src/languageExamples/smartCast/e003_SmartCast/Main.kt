package languageExamples.smartCast.e003_SmartCast

fun main() {
    val s = Squirrel()
    val c = Cat()
    val str = "Emily"

    smart(s)
    smart(c)
    smart(str)
}

fun smart(x: Any) {
    if (x is Animal) {
        println(x.getAnimalName())
        x.makeSound()
    } else {
        println("$x is not an animal")
    }
}