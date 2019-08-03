package practice.e035_MexicanWave

fun main() {
    val input = "a b"
    val result = mexicanWave(input)
    println(result)
}

fun mexicanWave(input: String): List<String> {
    val result = ArrayList<String>()
    val str = input.toLowerCase().toCharArray()

    str.forEachIndexed { i, e ->
        if (e != ' ') {
            val word = str.mapIndexed { j, c -> if (j == i) c.toUpperCase() else c }
            result.add(word.joinToString(""))
        }
    }

    return result
}