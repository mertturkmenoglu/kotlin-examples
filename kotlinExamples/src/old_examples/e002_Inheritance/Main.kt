package old_examples.e002_Inheritance

fun main(args: Array<String>) {

    buildAquarium()
    makeFish()

}

fun buildAquarium() {

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}\n" +
            "Width: ${myAquarium.width}\n" +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")

}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\nPlecostomus: ${pleco.color}")
}
