package example_22

/**
 * Kotlin data class example
 */
fun main() {
    val firstUser = User("John", 1, "England")

    val secondUser = User("Martin", 2, "France")

    val thirdUser = User("Mehmet", 3, "Turkey")

    // toString is auto-generated for data class
    println(firstUser)
    println(secondUser)
    println(thirdUser)

    // equals is auto-generated
    println(firstUser == secondUser)

    // hashCode is auto-generated
    println(firstUser.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
}