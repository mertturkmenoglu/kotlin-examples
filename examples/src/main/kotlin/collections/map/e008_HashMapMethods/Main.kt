package collections.map.e008_HashMapMethods

fun main() {
    val hashMap = HashMap<String, Int>()

    @Suppress("ReplacePutWithAssignment")
    hashMap.put("Emily", 1)

    hashMap["Diana"] = 2

    @Suppress("ReplaceGetOrSet")
    val i = hashMap.get("Diana")
    println(i)

    val j = hashMap["Diana"]
    println(j)

    val result = hashMap.containsKey("Barbara")
    println(result)

    val contains = hashMap.containsValue(2)
    println(contains)

    hashMap["Barbara"] = 3
    hashMap["Selina"] = 4
    println(hashMap)

    hashMap.putAll(arrayOf("Dinah" to 5, "Lois" to 6))
    println(hashMap)

    for (key in hashMap.keys) {
        println(key)
    }

    for (value in hashMap.values) {
        println(value)
    }

    for (entry in hashMap.entries) {
        println(entry)
    }

    hashMap.remove("Emily")
    println(hashMap)

    hashMap.clear()
    println(hashMap)
}