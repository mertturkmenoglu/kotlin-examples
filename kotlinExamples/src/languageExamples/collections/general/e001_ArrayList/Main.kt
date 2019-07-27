package languageExamples.collections.general.e001_ArrayList

import kotlin.random.Random

fun main() {
    @Suppress("SpellCheckingInspection")
    val nums = ArrayList<Int>()
    val names = ArrayList<String>()
    names.add("Emily")
    names.add("Diana")
    names.add("Barbara")
    names.add("Selina")
    names.add("Raven")

    repeat(5) {
        nums.add(Random.nextInt(-5, 40))
    }

    println(nums)
    println(names)

    println(nums.all { it > 0 })
    println(nums.any { it > 10 })
    println(nums.binarySearch(3))
    println(nums.count { num -> num == 5 })
    @Suppress("SpellCheckingInspection")
    val tmpNums = ArrayList<Int>()
    nums.forEach {
        tmpNums.add(it)
    }
    println("tmp: $tmpNums")
    nums.fill(0)
    println("Nums: $nums")
    nums.clear()
    tmpNums.forEach {
        nums.add(it)
    }
    println("Nums: $nums")

    println("Array: ${nums.toArray().asList()}")
    println("Sum: ${nums.sum()}")
    nums.reverse()
    println("$nums")
    println(nums.filter { it > 0 })
    println("$nums")

    println(names.find { it === "Raven" })
    println(nums.filter {it > 0 }.joinToString("", "", ""))
    println(names.random())
}