package serialization.e003_Serialization

import java.io.Serializable

class Person: Serializable {
    var name: String
    @Transient var status: Int

    companion object {
        var mAge: Int = 0
    }

    @Suppress("ConvertSecondaryConstructorToPrimary")
    constructor(age: Int, name: String, status: Int) {
        mAge = age
        this.name = name
        this.status = status
    }

    fun printPerson() {
        println("Name: $name\tAge: $mAge\tStatus: $status")
    }
}