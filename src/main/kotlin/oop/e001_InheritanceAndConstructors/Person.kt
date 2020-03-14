package oop.e001_InheritanceAndConstructors

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