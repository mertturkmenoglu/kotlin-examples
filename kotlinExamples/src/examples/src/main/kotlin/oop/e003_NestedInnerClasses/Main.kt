package oop.e003_NestedInnerClasses

class Canvas {
    @Suppress("unused")
    val outerClassName = "Canvas"

    fun introduce() {
        println("I am Canvas class")
    }

    class NestedClass {
        fun introduce() {
            println("I am NestedClass inside Canvas")
        }
    }
}

class Outer {
    val outerClassName = "Outer"

    fun introduce() {
        println("I am Outer class")
    }

    inner class InnerClass {
        fun introduce() {
            println("I am InnerClass inside Outer")
            println("OuterClassName: $outerClassName")
        }
    }
}


fun main() {
    val canvas = Canvas()
    val nested = Canvas.NestedClass()
    val outer = Outer()
    val innerClass = outer.InnerClass()

    canvas.introduce()
    nested.introduce()
    outer.introduce()
    innerClass.introduce()

}