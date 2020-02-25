package serialization.e001_Serialization

import java.io.Serializable

class Info(val age: Int, val name: String): Serializable {
    fun printInfo() {
        println("$name: $age")
    }
}