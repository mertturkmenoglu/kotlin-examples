package practice.e003_MorseCode

val morse = arrayOf(null, 'T', 'E', 'M', 'N', 'A', 'I', 'O', 'G', 'K', 'D', 'W', 'R', 'U', 'S', '?', '.', 'Q', 'Z', 'Y', 'C', 'X', 'B', 'J', 'P', null, 'L', '-', 'F', 'V', 'H', '0', '9', '8', null, '7', null, null, null, null, null, null, null, null, '6', '1', null, null, null, null, null, null, null, '2', null, null, null, '3', null, '4', '5')


fun encode(str: String): String {
    require(!str.toUpperCase().filterNot { it == ' ' }.any { morse.indexOf(it) == -1 })
    var result = ""

    str.toUpperCase().forEach {
        if (it == ' ') {
            result += " "
        } else {
            var index = morse.indexOf(it) + 1
            var tmp = ""

            while (index != 1) {
                tmp += if (index % 2 == 0) '-' else '.'
                index /= 2
            }

            result += tmp.reversed() + ' '
        }
    }

    return result.trim()
}

fun decode(str: String): String {
    require(!str.any { it !in listOf(' ', '-', '.') })
    var result = ""
    var index = 1

    for (c in str) {
        when (c) {
            '.' -> index = index * 2 + 1
            '-' -> index *= 2
            ' ' -> {
                result += if (index == 1)
                    ' '
                else
                    morse[index - 1] ?: throw Exception("Invalid morse code")
                index = 1
            }
            else -> throw Exception("Invalid morse code")
        }
    }

    if (index != 1)
        result += morse[index - 1] ?: throw Exception("Invalid morse code")

    return result
}

fun main() {
    println(encode("MERHABA EMILY"))
    println(decode(encode("MERHABA M")))
    println(decode("-- . .-. .... .- -... .-  --"))
}