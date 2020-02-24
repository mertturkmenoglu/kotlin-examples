package functional.e023_FunctionComposition

typealias Fun<A, B> = (A) -> B

private infix fun <A, B, C> Fun<A, B>.then(f: Fun<B, C>): Fun<A, C> = { x: A -> f(this(x)) }
private infix fun <A, B, C> Fun<B, C>.after(f: Fun<A, B>): Fun<A, C> = { x: A -> this(f(x)) }

fun getNumber(str: String): Float {
    return mapOf("zero" to 0f, "one" to 1f, "zero point twenty five" to 0.25f)
            .getOrDefault(str, -1f)
}

val getNumber2: Fun<String, Float> = { str ->
    mapOf("zero" to 0f, "one" to 1f, "zero point twenty five" to 0.25f).getOrDefault(str, -1f)
}

fun getString(number: Float): String {
    return mapOf(0f to "zero", 1f to "one", 0.25f to "zero point twenty five")
            .getOrDefault(number, "Undefined")
}

val getString2: Fun<Float, String> = { number ->
    mapOf(0f to "zero", 1f to "one", 0.25f to "zero point twenty five").getOrDefault(number, "Undefined")
}

fun divideByTwo(x: Float): Float = x / 2f
val divideByTwo2: Fun<Float, Float> = { x -> x / 2f }

fun main() {
    val result = (::getNumber then ::divideByTwo then ::divideByTwo then ::getString)("one")
    val result2 = (getNumber2 then divideByTwo2 then divideByTwo2 then getString2)("one")
    val result3 = getString(divideByTwo(divideByTwo(getNumber("one"))))
    val result4 = (::getString after ::divideByTwo after ::divideByTwo after ::getNumber)("one")

    println(result)
    println(result2)
    println(result3)
    println(result4)
}


