package practice.problemSolving.e113_BestSale

// Given a list of stock prices, find which day to buy and sell
// for max profit. Return indices.
fun main() {
    val prices = listOf(10, 7, 6, 2, 9, 4)
    val result = bestSale(prices)

    println(result)
}

@Throws(IllegalArgumentException::class)
fun bestSale(prices: List<Int>): Pair<Int, Int> {
    require(prices.isNotEmpty() && prices.all { it > 0 }) { "Invalid list" }

    with (prices.withIndex()) {
        val result =
                this
                .map { it to this.drop(it.index + 1).filter { x -> it.value < x.value } }
                .filter { it.second.isNotEmpty() }
                .map { it.first to (it.second.maxBy { x -> x.value } ?: IndexedValue(-1, -1)) }
                .maxBy { it.second.value - it.first.value }

        return result?.let { it.first.index to it.second.index } ?: 0 to 0
    }
}