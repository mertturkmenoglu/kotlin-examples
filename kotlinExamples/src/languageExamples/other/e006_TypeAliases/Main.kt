package languageExamples.other.e006_TypeAliases

typealias UserCredentials = Pair<String, String>

fun main() {
    val firstUserInfo = UserCredentials("username_fst", "password_fst")
    val secondUserInfo = UserCredentials("username_snd", "password_snd")

    println(firstUserInfo)
    println(secondUserInfo)
}