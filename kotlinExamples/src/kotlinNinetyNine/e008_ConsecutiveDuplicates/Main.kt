package kotlinNinetyNine.e008_ConsecutiveDuplicates

fun main() {
    val result = compress("aaaabccaadeeee".toList())
    println(result)
}

fun compress(list: List<Char>) = ArrayList<Char>().apply { add(list.first()) }.also { result ->
        list.drop(1).forEach {
            if (it != result.last())
                result.add(it)
        }
    }