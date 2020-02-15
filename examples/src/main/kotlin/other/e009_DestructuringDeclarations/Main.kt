package other.e009_DestructuringDeclarations

class Rect(val x1: Double, val y1: Double, val x2: Double, val y2: Double) {
    operator fun component1(): Double = x1
    operator fun component2(): Double = y1
    operator fun component3(): Double = x2
    operator fun component4(): Double = y2

    override fun toString(): String {
        return "[($x1, $y1), ($x2, $y2)]"
    }
}

fun main() {
    val rect = Rect(3.0, 4.0, 5.0, 12.0)
    val (x1, y1, x2, y2) = rect

    println(rect)
    println(x1)
    println(y1)
    println(x2)
    println(y2)
}