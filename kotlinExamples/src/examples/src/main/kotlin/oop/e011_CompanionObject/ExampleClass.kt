package oop.e011_CompanionObject

interface Factory<T> {
    fun create(name: String): T
}

class ExampleClass private constructor(val name: String) {
    companion object : Factory<ExampleClass> {
        override fun create(name: String): ExampleClass {
            return ExampleClass(name)
        }
    }
}