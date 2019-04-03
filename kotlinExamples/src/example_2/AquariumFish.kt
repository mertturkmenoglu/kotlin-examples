package example_2


abstract class AquariumFish {
    abstract val color: String

}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Munch on algae")
    }
}

interface FishAction {
    fun eat()
}
