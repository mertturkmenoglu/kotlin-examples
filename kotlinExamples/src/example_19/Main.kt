package example_19

fun main() {
    val v1 = Vector(1f, 2f)
    val v2 = Vector(2f, 3f)
    val v3 = v1 + v2
    v3.printVector()
    val v4 = v1 - v2
    v4.printVector()
    val times = v1 * v2
    println(times)
    val v5 = v1 / 2f
    v5.printVector()
}