package example_5

//Args: "12"
fun main(args: Array<String>) {

    println("Good ${if(args[0].toInt() > 12) "night" else "morning"}, Kotlin")

}