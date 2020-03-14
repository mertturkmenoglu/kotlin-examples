package functional.e026_Maybe

sealed class Maybe

class Just<T>(val value: T) : Maybe() {
    override fun toString(): String {
        return value.toString()
    }
}

object Nothing : Maybe() {
    override fun toString(): String {
        return "Nothing"
    }
}

fun computation(number: Int): Maybe {
    return if (number > 2) {
        Just(5)
    } else {
        Nothing
    }
}

fun main() {
    val result = computation(5)

    if (result is Just<*>) {
        println(result)
    } else {
        println(result)
    }
}