package old_examples.e011_Input

import java.util.Scanner

fun main() {

    print("Please enter an integer: ")
    var number = (readLine() !!).toInt()

    println("You entered: $number")
    number ++
    println("New value: $number")

    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    val integer: Int = reader.nextInt()

    println("You entered: $integer. I read it with Java...")


}