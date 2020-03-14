package serialization.e002_Deserialization

import Resources
import serialization.deleteFile
import serialization.deserializeInfo
import serialization.serialize

fun main() {
    val o = Info(35, "Emily")
    val path = "${Resources.path}/file"

    serialize(o, path)
    deserializeInfo(path)
    deleteFile(path)
}