// Powered by Weather API
// https://openweathermap.org/

package networking.e006_WeatherAPI

import com.beust.klaxon.Klaxon
import java.io.StringReader
import java.net.URL

data class CityWeather(@Suppress("SpellCheckingInspection") val coord: Coordinate, val weather: Weather, val main: WeatherInfo, val wind: Wind)
data class Coordinate(val lon: Double, val lat: Double)
data class Weather(val id: Int, val main: String, val description: String)
data class WeatherInfo(val temp: Double, val pressure: Int, val humidity: Int, val temp_min: Double, val temp_max: Double)
data class Wind(val speed: Double, val deg: Int)

@Suppress("LocalVariableName")
fun main() {
    val API_KEY = "YOUR_API_KEY_GOES_HERE" // [YOUR API KEY GOES HERE]
    val endPoint = "http://api.openweathermap.org/data/2.5"

    println("City: ")
    val city = readLine()?.toLowerCase() ?: throw Exception()

    println("Units: metric or imperial")
    val units = readLine()?.toLowerCase() ?: throw Exception()

    @Suppress("SpellCheckingInspection")
    val url = URL("$endPoint/weather?q=$city&units=$units&mode=json&appid=$API_KEY")

    try {
        val response = url.readText()
        val weather = parseWeather(response)
        weather.formattedPrint()
    } catch (e: Exception) {
        System.err.println("Invalid entry")
    }
}

fun parseWeather(response: String): CityWeather {
    val klaxon = Klaxon()
    val parsed = klaxon.parseJsonObject(StringReader(response))

    @Suppress("SpellCheckingInspection")
    val parsedCoordinate = parsed.obj("coord")
    val parsedWeather = parsed.array<Any>("weather")
    val parsedMain = parsed.obj("main")
    val parsedWind = parsed.obj("wind")

    @Suppress("SpellCheckingInspection")
    val coord = parsedCoordinate?.let { klaxon.parseFromJsonObject<Coordinate>(it) } ?: throw Exception()
    val weather = parsedWeather?.let { klaxon.parseFromJsonArray<Weather>(it) }?.first() ?: throw Exception()
    val main = parsedMain?.let { klaxon.parseFromJsonObject<WeatherInfo>(it) } ?: throw Exception()
    val wind = parsedWind?.let { klaxon.parseFromJsonObject<Wind>(it) } ?: throw Exception()

    return CityWeather(coord, weather, main, wind)
}

fun CityWeather.formattedPrint() {
    println("Longitude: ${coord.lon}")
    println("Latitude: ${coord.lat}")
    println("City id: ${weather.id}")
    println("Weather description: ${weather.description}")
    println("Abstract: ${weather.main}")
    println("Temperature: ${main.temp}")
    println("Minimum temperature: ${main.temp_min}")
    println("Maximum temperature: ${main.temp_max}")
    println("Pressure: ${main.pressure}")
    println("Humidity: ${main.humidity}")
    println("Wind speed: ${wind.speed}")
    println("Wind degree: ${wind.deg}")
}