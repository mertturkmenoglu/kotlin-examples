package serialization.e003_Serialization

import java.io.*

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

    p = deserialize(path)

    println("--------")
    p?.printPerson()

    deleteFile(path)
}

fun serialize(o: Person, path: String) {
    try {
        val fos = FileOutputStream(path)
        val oos = ObjectOutputStream(fos)

        oos.writeObject(o)
        oos.flush()
        oos.close()
        fos.close()

        println("Serialization completed")
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

fun deserialize(path: String): Person? {
    var obj: Person? = null

    try {
        val fis = FileInputStream(path)
        val ois = ObjectInputStream(fis)

        obj = ois.readObject() as Person
        fis.close()
        ois.close()

        println("Deserialization completed")
    } catch (e: IOException) {
        e.printStackTrace()
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    }

    return obj
}

fun deleteFile(path: String) {
    try {
        if (File(path).delete()) {
            println("Serialized file deleted")
        } else {
            println("Delete operation failed")
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}