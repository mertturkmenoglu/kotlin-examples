package example_17

fun main(args: Array<String>) {

    repeat(10) {
        println(whatShouldIDoToday("unhappy"))
    }

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24):String {
    return when {
        mood == "happy" && weather == "sunny"-> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "Go swimming"
        else -> "Stay at home"
    }
}