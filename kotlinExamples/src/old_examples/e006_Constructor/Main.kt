package old_examples.e006_Constructor


fun main(args: Array<String>) {

    val person1 = Person("person1", 20, true)
    val person2 = Person("person2")

    println(person1.name + person1.age.toString() + person1.gender.toString())
    println(person2.name + person2.age.toString() + person2.gender.toString())

}