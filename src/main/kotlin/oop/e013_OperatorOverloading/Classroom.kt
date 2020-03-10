package oop.e013_OperatorOverloading

@Suppress("MemberVisibilityCanBePrivate")
class Classroom(var teacher: String, var students: MutableList<Pair<String, Int>>) {
    operator fun get(stdID: Int) = students.first { it.second == stdID }
    operator fun get(name: String) = students.first { it.first == name }
}