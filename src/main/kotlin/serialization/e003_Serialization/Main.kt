package serialization.e003_Serialization

import Resources
import serialization.deleteFile
import serialization.deserializePerson
import serialization.serialize

fun main() {
    val path = "${Resources.path}/file"
    var p: Person? = Person(40, "Emily", 3)

    if (p != null) {
        p.printPerson()
        println("Serialization begins")
        serialize(p, path)
        println("--------")
        println("Changing values")
        Person.mAge = 35
        p.status = 7
        p.printPerson()
    }

    p = deserializePerson(path)

    println("--------")
    p?.printPerson()

    deleteFile(path)
}