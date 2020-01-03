package smartCast.e004_SmartCast

class Cat : Animal {
    override fun getAnimalName() = "Cat"

    override fun makeSound() = println("Meow")

    fun catFunction() = println("Cat function")
}