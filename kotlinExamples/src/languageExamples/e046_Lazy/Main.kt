package languageExamples.e046_Lazy

class DataBase {
    private val values = ArrayList<String>()

    fun addUser(name: String) = values.add(name)

    fun findUser(name: String) = values.find { it == name }
            .also { println("Access to database") }
}

fun main() {
    val db = DataBase()

    with(db) {
        addUser("Emily")
        addUser("Diana")
        addUser("Barbara")
        addUser("Selina")
    }

    println("Before lazy block")
    val best = lazy { db.findUser("Emily") }
    println("After lazy block")

    println("Before println")
    println(best.value)
    println("After println")
}