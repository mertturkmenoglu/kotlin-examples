@file:JvmName("KotlinClass")

package jvm.e003_JavaInteroperability

class KotlinClass(val name: String, val level: Int) {
    fun printInfo() = println("$name - $level")
}