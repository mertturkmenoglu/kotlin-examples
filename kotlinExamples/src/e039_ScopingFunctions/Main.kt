package e039_ScopingFunctions

fun main() {
    val p1 = Person("Emily", 35)
    println(p1)
    with(p1) {
        println(name)
        println(age)
    }


    val p2 = Person("Diana", 30).also {
        println(it.name)
        println(it.age)
    }
    println(p2)

    val p3 = Person().apply {
        name = "Barbara"
        age = 27
    }
    println(p3)
}

