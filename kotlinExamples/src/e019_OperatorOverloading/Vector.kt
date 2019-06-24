package e019_OperatorOverloading

class Vector(var x: Float = 0f, var y: Float = 0f) {
    operator fun plus(other: Vector) = Vector(x + other.x, y + other.y)
    operator fun minus(other: Vector) = Vector(x - other.x, y - other.y)
    operator fun times(other: Vector) = x * other.x + y * other.y
    operator fun div(num: Float) = Vector(x / num, y / num)

    fun printVector() {
        println("$x\t$y")
    }
}