package algorithms.random.e002_DifferentProbabilityNumberGeneration

import kotlin.random.Random.Default.nextInt

fun main() {
    val p = listOf(0 to 23, 1 to 27, 2 to 50)
    val r = ArrayList<Int>()
    val n = 1_000_000
    repeat(n) {
        r.add(generateRandom(p))
    }

    for (i in 0..2) {
        val count = r.count { it == i }
        println("$i: ${ count / n.toFloat() }")
    }
}

fun generateRandom(numbers: List<Pair<Int, Int>>): Int {
    require(numbers.sumBy { it.second } == 100) { "Probabilities sum must be equal to 100" }
    val r = nextInt(1, 101) // [1, 100]

    for (i in numbers.indices) {
        if (r <= numbers.take(i+1).sumBy { it.second }) {
            return numbers[i].first
        }
    }

    return numbers.last().first
}