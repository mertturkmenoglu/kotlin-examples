package practice.problemSolving.e095_CaseDetection

fun main() {
    val input = listOf("PascalCase", "snake_case", "camelCase")
    val result = input.map(::caseDetection)
    println(result)
}

// Assume every string can be categorized
fun caseDetection(str: String) = when {
    str[0].isUpperCase() -> "PascalCase"
    str.contains('_') -> "snake_case"
    else -> "camelCase"
}