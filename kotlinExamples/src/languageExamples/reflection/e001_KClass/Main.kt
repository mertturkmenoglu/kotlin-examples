package languageExamples.reflection.e001_KClass

data class Person(val name: String, val age: Int)

fun main() {
    val strVal = "Emily"
    val intVal = 42
    val realVal = 3.14
    val nullableStr: String? = null
    val person = Person("Emily", 35)
    val type = Person::class

    println(strVal::class)
    println(intVal::class)
    println(realVal::class)
    println(nullableStr?.javaClass)
    println(person::class)
    println(type)
}