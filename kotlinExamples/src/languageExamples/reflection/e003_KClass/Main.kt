package languageExamples.reflection.e003_KClass

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class Vector2D(private val x: Int, private val y: Int) {
    operator fun plus(other: Vector2D) = Vector2D(x + other.x, y + other.y)
}

fun main() {
    val type = Vector2D::class

    println("Type parameters: ${type.typeParameters}")
    println("Members: ${type.members}")
    println("Member properties: ${type.memberProperties}")
    println("Member functions: ${type.memberFunctions}")
}