package practice.e071_UpsideDownNumbers

fun main() {
    val input = "101"
    val result = isUpsideDown(input)
    println(result)
}

fun isUpsideDown(input: String): Boolean {
    val m = mapOf('0' to '0', '1' to '1', '6' to '9', '8' to '8', '9' to '6')
    if (input.startsWith("0") || input.any { it !in m.keys })
        return false

    val limit = if (input.length % 2 == 0) input.length / 2 else input.length / 2 + 1

    for (i in 0..limit) {
        if (m[input[i]] != input[input.length - 1 - i])
            return false
    }

    return true
}