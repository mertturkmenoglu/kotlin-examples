package collections.treemap.e001_TreeMap

import java.util.*

fun main() {
    val tm = TreeMap<Int, String>()
    tm[1] = "One"
    tm[2] = "Two"
    tm[3] = "Three"
    tm[6] = "Six"
    tm[4] = "Four"
    tm[5] = "Five"

    println("All elements: ")
    println(tm)

    println("Remove key:1 element: ")
    tm.remove(1)
    println(tm)

    println("Remove key:2 element: ")
    tm.remove(2, "Two")
    println(tm)
}