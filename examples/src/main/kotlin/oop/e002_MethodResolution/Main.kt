package oop.e002_MethodResolution

interface Person {
    fun introduce() {
        print("Person")
    }
}

interface Player {
    fun introduce() {
        print("Player")
    }
}

class FootballPlayer : Person, Player {

    override fun introduce() {
        print("Hi")
    }

}

fun main() {
    val fp = FootballPlayer()
    fp.introduce()
}