package example_1

abstract class Animal {

    abstract val speciesName: String
    abstract val age: Int
    abstract val color: String


}

class Cat: Animal(), AnimalAction {

    override val speciesName = "Kedi"
    override val age = 0
    override val color = "gray"
    override fun eat() = println("Cats eat meat and drink milk.")
    override fun sound() = println("Meow")

}

class Dog: Animal(), AnimalAction {

    override val speciesName = "Köpek"
    override val age = 0
    override val color = "gray"
    override fun eat() = println("Dogs eat meat and drink water.")
    override fun sound() = println("Bark")

}

interface AnimalAction {
    fun eat()
    fun sound()
}


