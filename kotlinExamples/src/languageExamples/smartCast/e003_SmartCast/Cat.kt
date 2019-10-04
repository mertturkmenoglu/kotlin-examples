package languageExamples.smartCast.e003_SmartCast

class Cat : Animal {
    override fun getAnimalName() = "Cat"

    override fun makeSound() = println("Meow")

    fun catFunction() = println("Cat function")
}