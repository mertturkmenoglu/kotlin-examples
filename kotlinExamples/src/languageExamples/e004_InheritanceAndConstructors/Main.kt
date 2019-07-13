package languageExamples.e004_InheritanceAndConstructors

open class Person {
    private var name: String
        get() {
            return "Person: $field"
        }

    var age: Int = -1
        set(value) {
            if (value >= 20)
                field = value
        }


    constructor(name: String) {
        println("Person  secondary constructor with 1 parameter called")
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        println("Person  secondary constructor with 2 parameter called")
        this.age = age
    }
}

class Teacher : Person {
    constructor(name: String) : super(name) {
        println("Teacher secondary constructor with 1 parameter called")
    }

    constructor(name: String, age: Int) : super(name, age) {
        println("Teacher secondary constructor with 2 parameter called")
    }
}

@Suppress("UNUSED_VARIABLE")
fun main() {
    val w1 = Teacher("Emily")
    val w2 = Teacher("Emily", 35)
    val p1 = Person("Emily")
    val p2 = Person("Emily", 35)
    p1.age = 32
    print(p1.age)
}