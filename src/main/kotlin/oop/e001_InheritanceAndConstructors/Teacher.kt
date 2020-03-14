package oop.e001_InheritanceAndConstructors

class Teacher : Person {
    constructor(name: String) : super(name) {
        println("Teacher secondary constructor with 1 parameter called")
    }

    constructor(name: String, age: Int) : super(name, age) {
        println("Teacher secondary constructor with 2 parameter called")
    }
}