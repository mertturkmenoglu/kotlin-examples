package designPatterns.e006_Builder

fun main() {
    val emily = Person.Builder()
            .setName("Emily")
            .setSurname("Smith")
            .setAge(35)
            .setHeight(173.0)
            .setWeight(52.0)
            .setLocation("London")
            .build()

    println(emily)
}