package languageExamples.e048_AnonymousObject

open class Sherlock(val name: String, val surname: String) {
    fun saySomething() = println("221B")
}

fun main() {
    val sherlock = object:  Sherlock("Sherlock", "Holmes") {
        fun saySomethingClever() = println("221B Baker Street")
    }

    sherlock.saySomethingClever()
    println(sherlock.name)
    println(sherlock.surname)
}