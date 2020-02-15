package smartCast.e003_SmartCast

class Squirrel : Animal {
    override fun getAnimalName() = "Squirrel"

    override fun makeSound() = println("Little Squirrel Sounds")

    @Suppress("unused")
    fun specialSquirrelFunction() = println("Very special squirrel function")
}