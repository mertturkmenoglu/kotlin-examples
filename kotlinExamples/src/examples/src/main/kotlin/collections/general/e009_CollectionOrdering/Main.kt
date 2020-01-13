package collections.general.e009_CollectionOrdering

class Point(val x: Int, val y: Int) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return (this.x * this.x + this.y * this.y) - (other.x * other.x + other.y * other.y)
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}

fun main() {
    val points = listOf(Point(0, 3), Point(4, 0), Point(3, 5))
    println("Natural order: $points")

    println("Descending sorted: " + points.sortedDescending())

    val xValueComparator = Comparator { p1: Point, p2: Point -> p1.x - p2.x }
    println("Sorted by their x values: " + points.sortedWith(xValueComparator))

    println("Sorted by their y values: " + points.sortedWith(compareBy { it.y }))
}