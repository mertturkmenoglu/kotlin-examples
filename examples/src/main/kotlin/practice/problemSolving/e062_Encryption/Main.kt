package practice.problemSolving.e062_Encryption

fun main() {
    val input = "Emily"
    val result = encrypt(input)
    println(result)
}

fun encrypt(str: String) = str.map {
    when (it) {
        in ('A' until 'Z').union('a' until 'z') -> (it.toInt() + 1).toChar()
        'Z' -> 'A'
        'z' -> 'a'
        else -> it
    }
}.joinToString("")