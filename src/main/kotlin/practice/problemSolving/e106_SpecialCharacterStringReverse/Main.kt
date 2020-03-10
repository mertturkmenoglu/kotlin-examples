package practice.problemSolving.e106_SpecialCharacterStringReverse

import java.lang.StringBuilder

@Suppress("SpellCheckingInspection")
fun main() {
    val input = "emily!is$\$the3be4st"
    val result = reverseAlphabetical(input)
    // Expected output: tsebe!ht$$siy3li4me
    println(result)
}

@Suppress("SameParameterValue")
private fun reverseAlphabetical(str: String): String {
    val sb = StringBuilder()
    sb.append(str)
    var l = 0
    var r = sb.length - 1

    while (l <= r) {
        if (!sb[l].isLetter()) {
            l++
        }

        if (!sb[r].isLetter()) {
            r--
        }

        if (sb[l].isLetter() && sb[r].isLetter()) {
            sb[l] = sb[r].also { sb[r] = sb[l] }
            l++
            r--
        }
    }

    return sb.toString()
}
