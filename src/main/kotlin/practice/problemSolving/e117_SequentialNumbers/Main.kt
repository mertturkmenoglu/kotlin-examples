package practice.problemSolving.e117_SequentialNumbers

fun main() {
    val input = (-5).rangeTo(5).step(2).toList()
    val result = groupSequentialNumbers(input)

    println(result)
}

fun groupSequentialNumbers(numbers: List<Int>): List<List<Int>> {
    if (numbers.isEmpty()) {
        return emptyList()
    }

    val sequences = ArrayList<ArrayList<Int>>()
    val currentList = ArrayList<Int>()

    for ((current, next) in numbers.zipWithNext()) {
        currentList.add(current)

        if (next - current != 1) {
            sequences.add(ArrayList(currentList))
            currentList.clear()
        }
    }

    if (currentList.isNotEmpty()) {
        sequences.add(ArrayList(currentList))
    }

    return sequences.apply {
        if (numbers.last() - this.last().last() == 1) {
            this.last().add(numbers.last())
        } else {
            this.add(arrayListOf(numbers.last()))
        }
    }
}