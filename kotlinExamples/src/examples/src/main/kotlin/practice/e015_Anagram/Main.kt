package practice.e015_Anagram

fun isAnagram(fst: String, snd: String) = fst.toList().sorted().zip(snd.toList().sorted()).all { it.first == it.second }

fun main() {
    @Suppress("SpellCheckingInspection")
    println(listOf("emily", "miley", "ylime", "mert").filter { isAnagram("emily", it) })
}