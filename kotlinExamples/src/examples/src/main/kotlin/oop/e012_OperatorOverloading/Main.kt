package oop.e012_OperatorOverloading

data class Point(val x: Double, val y: Double)

class Rect(val x1: Double, val y1: Double, val x2: Double, val y2: Double) {
    operator fun contains(p: Point): Boolean {
        return p.x > x1 && p.x < x2 && p.y > y1 && p.y < y2
    }
}

/**
 * (0,0) ----------> +x
 * |
 * |
 * |
 * |
 * |
 * v
 * +y
 */
fun main() {
    val p = Point(1.0, 5.0)
    val rect = Rect(0.0, 0.0, 10.0, 8.0)

    println(p in rect)
    println(p !in rect)
}