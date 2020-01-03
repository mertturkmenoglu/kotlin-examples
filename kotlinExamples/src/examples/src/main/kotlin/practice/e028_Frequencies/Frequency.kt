package practice.e028_Frequencies

fun frequency(str: String): MutableMap<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    str.forEach {
        if (map.containsKey(it)) {
            map.replace(it, map.getValue(it) + 1)
        } else {
            map[it] = 1
        }
    }

    return map
}