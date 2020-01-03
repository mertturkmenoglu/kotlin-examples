package smartCast.e003_SmartCast

class Cat : Animal {
    override fun getAnimalName() = "Cat"

    override fun makeSound() = println("Meow")

    @Suppress("unused")
    fun catFunction() = println("Cat function")
}