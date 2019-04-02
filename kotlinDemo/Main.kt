import java.lang.Integer.parseInt

fun main(args: Array<String>) {

    println("Kotlin Basics test")

    val a = 3
    val b = 5
    var c = 4
    c++
    println("c: $c")

    println("Sum of the a and b: ${sum1(a,b)} \t ${sum2(a,b)}")
    stringTemplates()

    println("Max of $a and $b is: ${maxOf1(a,b)}")
    println("But also, with reverted return statement: ${maxOf2(a,b)}")
    println("It is shocking but with third function, it still works! ${maxOf3(a,b)}")

    //For loop
    val numbers = listOf(10, 20, 30, 40, 50)
    for (number in numbers) {
        print("$number\t")
    }

    println()
    //While loop
    var index = 0
    while(index < numbers.size) {
        println("Number at $index is ${numbers[index]}")
        index++
    }

    val strReturn = whatIsIt("Hello")
    println(strReturn)

    val lower = 0
    val higher = 8
    if(a in lower..higher+1)
        println("It is a digit")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

}

fun sum1(a: Int, b: Int): Int {
    return a+b
}

fun sum2(a: Int, b: Int) = a + b

fun stringTemplates() {
    var a = 1
    val s1 = "a is $a"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")} but now a is $a"
    println(s2)
}

fun maxOf1(a: Int, b: Int): Int {
    if(a>b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    return if(a>b) {
        a
    } else {
        b
    }
}

fun maxOf3(a: Int, b: Int) = if(a>b)a else b

fun whatIsIt(obj: Any): String =
    when(obj) {
        1 -> "Number"
        "Hello" -> "String"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> {
            "I don't know"
        }
    }





