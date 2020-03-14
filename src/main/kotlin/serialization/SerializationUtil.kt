package serialization

import serialization.e002_Deserialization.Info
import serialization.e003_Serialization.Person
import java.io.*

fun serialize(o: Any, path: String) {
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

fun deserializePerson(path: String): Person? {
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

fun deserializeInfo(path: String): Info? {
    var obj: Info? = null

    // Deserialization
    try {
        val fis = FileInputStream(path)
        val ois = ObjectInputStream(fis)

        obj = ois.readObject() as Info
        fis.close()
        ois.close()

        println("Deserialization completed")
        obj.printInfo()
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