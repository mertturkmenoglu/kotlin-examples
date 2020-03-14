package oop.e001_InheritanceAndConstructors

@Suppress("UNUSED_VARIABLE")
fun main() {
    val t1 = Teacher("Emily")
    val t2 = Teacher("Emily", 35)
    val p1 = Person("Emily")
    val p2 = Person("Emily", 35)
    p1.age = 32
    print(p1.age)
}