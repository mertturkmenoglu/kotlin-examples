package reflection.e002_KClass

import java.io.Serializable
import kotlin.reflect.full.superclasses
import kotlin.reflect.jvm.jvmName

class TestClass : Serializable

fun main() {
    val type = TestClass::class

    println("Type: $type")
    println("Superclasses: ${type.superclasses}")
    println("Is final: ${type.isFinal}")
    println("Simple name: ${type.simpleName}")
    println("Type parameters: ${type.typeParameters}")
    println("Annotations: ${type.annotations}")
    println("Members: ${type.members}")
    println("Java object type: ${type.javaObjectType}")
    println("JVM name: ${type.jvmName}")
}