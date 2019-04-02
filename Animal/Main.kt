package Animal

fun main(args: Array<String>) {

    val myCat = Cat()
    val myDog = Dog()

    println( myCat.age.toString() + myCat.color + myCat.speciesName )
    myCat.eat()
    myCat.sound()
    println( myDog.age.toString() + myDog.color + myDog.speciesName )
    myDog.eat()
    myDog.sound()

    makeSound(myCat)


}

fun makeSound(animal: AnimalAction) {
    animal.sound()
}