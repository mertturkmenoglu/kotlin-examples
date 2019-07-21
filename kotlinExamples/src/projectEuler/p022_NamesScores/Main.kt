package projectEuler.p022_NamesScores

import java.io.File

/**
 * Using names.txt (right click and 'Save Link/Target As...'),
 * a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list
 * to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order,
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
 * is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
const val relativePath = "/kotlinExamples/src/projectEuler/p022_NamesScores/p022_names.txt"

fun main() {
    val lines = ArrayList<String>()
    File(System.getProperty("user.dir") + relativePath).forEachLine {lines.add(it) }

    val result = nameScore(lines.first())
    println(result)
}

fun nameScore(str: String): Long {
    val names = str.split(delimiters = *arrayOf(",")).map { it.drop(1).dropLast(1) }.sorted()
    var score = 0L

    names.forEachIndexed { i, it ->
        score += (i+1) * it.toCharArray().map { it.toInt() - 'A'.toInt() + 1 }.reduce { acc, num -> acc + num }.toLong()
    }

    return score
}