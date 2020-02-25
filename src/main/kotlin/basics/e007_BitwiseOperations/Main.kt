package basics.e007_BitwiseOperations

/**
 * Kotlin, at least for now, does not have special characters for bitwise operations.
 * Instead of them, Kotlin has infix functions. (For example: kotlin-stdlib/kotlin/Int/or)
 */
fun main() {
    val number1 = 27    // 0001_1011
    val number2 = 56    // 0011_1000

    println("First number:  " + Integer.toBinaryString(number1))
    println("Second number: " + Integer.toBinaryString(number2))

    // OR
    val orResult = number1 or number2
    println("$number1 OR $number2 = $orResult")

    // AND
    val andResult = number1 and number2
    println("$number1 AND $number2 = $andResult")

    // XOR
    val xorResult = number1 xor number2
    println("$number1 XOR $number2 = $xorResult")

    // INV
    val invResult = number1.inv()
    println("!$number1 = $invResult")

    // SHL
    val bitCount = 2
    val shlResult = number1 shl bitCount
    println("$number1 << $bitCount = $shlResult")

    // SHR
    val shrResult = number1 shr bitCount
    println("$number1 >> $bitCount = $shrResult")

    // USHR
    val number3 = -42
    val ushrResult = number3 ushr bitCount
    println("$number3 u>> $bitCount = $ushrResult")
}