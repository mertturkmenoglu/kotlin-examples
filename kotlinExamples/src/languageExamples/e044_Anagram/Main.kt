package languageExamples.e044_Anagram

fun isAnagram(first: String, second: String) = first.chars().sorted().toArray().zip(second.chars().sorted().toArray()).all { it.first == it.second }

fun main() {
    println(listOf("emily", "miley", "ylime", "mert").filter { isAnagram("emily", it) })
}