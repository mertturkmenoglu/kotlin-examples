package functional.e022_CurriedFunction

fun main() {
    val addTwoInt: (Int, Int) -> Int = { x, y -> x + y }
    val addTwoIntCurried: (Int) -> (Int) -> Int = { x -> { y -> x + y } }
    val addThree = addTwoIntCurried(2)

    println(addTwoInt(3, 5))
    println(addTwoIntCurried(3)(5))
    println(addThree(3))
}