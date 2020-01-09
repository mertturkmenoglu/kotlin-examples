package oop.e013_OperatorOverloading

fun main() {
    val c = Classroom("Emily", mutableListOf("Diana" to 13, "Barbara" to 42, "Selina" to 76, "Carol" to 21))
    println(c.teacher)
    println(c[13]) // Get Student with ID 13
    println(c["Selina"]) // Get Student Selina
}