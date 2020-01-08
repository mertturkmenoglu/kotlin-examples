package serialization.e002_Deserialization

import java.io.Serializable

class Info(val age: Int, val name: String): Serializable {
    fun printInfo() {
        println("$name: $age")
    }
}