package practice.problemSolving.e086_SimpleAssembler

fun main() {
    val input = listOf("mov a 5", "inc a", "dec a", "jnz a -1", "inc a")
    val result = assembler(input)
    println(result)
}

fun assembler(input: List<String>): Map<String, Int> {
    val registers = mutableMapOf("a" to 0, "b" to 0, "c" to 0, "d" to 0)
    var ip = 0

    while (ip < input.size) {
        val parts = input[ip].split(" ")
        val op1 = parts.component2()

        when (parts.first()) {
            "mov" -> {
                val op2 = parts.component3()
                require(op1 in registers.keys)
                registers[op1] = if (op2 in registers.keys) registers.getOrDefault(op2, 0) else op2.toInt()
                ip++
            }
            "inc" -> {
                require(op1 in registers.keys)
                registers[op1] = registers.getOrDefault(op1, 0) + 1
                ip++
            }
            "dec" -> {
                require(op1 in registers.keys)
                registers[op1] = registers.getOrDefault(op1, 0) - 1
                ip++
            }
            "jnz" -> {
                val op2 = parts.component3()
                require(op1 in registers.keys)
                ip += if (registers[op1] != 0) op2.toInt() else 1
            }
            else -> throw Exception()
        }
    }

    return registers
}