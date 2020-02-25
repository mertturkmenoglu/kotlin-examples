package practice.problemSolving.e104_ValidAnagram

fun main() {
    val str1 = "emily"
    val str2 = "iemyl"
    val str3 = "abc"
    val str4 = "def"

    val result1 = isAnagram(str1, str2)
    val result2 = isAnagram(str3, str4)

    println(result1)
    println(result2)
}

private fun isAnagram(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) {
        return false
    }

    val hashTable = Array(26) { 0 }
    val offset = 'a'.toInt()
    for (i in s1.indices) {
        hashTable[s1[i].toInt() - offset]++
        hashTable[s2[i].toInt() - offset]--
    }

    return hashTable.none { it != 0 }
}