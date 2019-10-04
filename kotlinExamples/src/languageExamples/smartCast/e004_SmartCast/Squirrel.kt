package languageExamples.smartCast.e004_SmartCast

class Squirrel : Animal {
    override fun getAnimalName() = "Squirrel"

    override fun makeSound() = println("Little Squirrel Sounds")

    fun specialSquirrelFunction() = println("Very special squirrel function")
}