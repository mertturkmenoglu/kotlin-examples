package old_examples.e018_InfixNotation

class Vector(private var x: Float = 0f, private var y: Float = 0f) {
    infix fun add(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }

    fun printVector() {
        println("$x\t$y")
    }
}