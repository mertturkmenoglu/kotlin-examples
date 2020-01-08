package serialization.e002_Deserialization

import java.io.*

fun main() {
    val o = Info(35, "Emily")
    val path = "${Resources.path}/file"

    serialize(o, path)

    // Deserialization
    try {
        val fis = FileInputStream(path)
        val ois = ObjectInputStream(fis)

        val obj = ois.readObject() as Info
        fis.close()
        ois.close()

        println("Deserialization completed")
        obj.printInfo()
    } catch (e: IOException) {
        e.printStackTrace()
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    }

    // Delete file
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

fun serialize(o: Info, path: String) {
    try {
        val fos = FileOutputStream(path)
        val oos = ObjectOutputStream(fos)

        oos.writeObject(o)
        oos.close()
        fos.close()

        println("Serialization completed")
    } catch (e: IOException) {
        e.printStackTrace()
    }
}