package oop.e008_AnonymousObject

open class Sherlock(val name: String, val surname: String) {
    @Suppress("unused")
    fun saySomething() = println("221B")
}

fun main() {
    val sherlock = object : Sherlock("Sherlock", "Holmes") {
        fun saySomethingClever() = println("221B Baker Street")
    }

    sherlock.saySomethingClever()
    sherlock.saySomething()
    println(sherlock.name)
    println(sherlock.surname)
}