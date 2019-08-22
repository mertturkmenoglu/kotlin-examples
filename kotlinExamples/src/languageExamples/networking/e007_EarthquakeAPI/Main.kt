package languageExamples.networking.e007_EarthquakeAPI

import com.beust.klaxon.Klaxon
import java.io.StringReader
import java.net.URL

data class Earthquake(val type: String, val properties: EarthquakeProperty, val geometry: EarthquakeGeometry, val id: String)
data class EarthquakeProperty(val mag: Double, val place: String, val time: Long, val updated: Long,
                              val url: String, val title: String)
data class EarthquakeGeometry(val type: String, val coordinates: List<Double>)

fun main() {
    val endPoint = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson"
    val startTime = "2017-01-01"

    var earthquakes: List<Earthquake>? = null

    println("Minimum magnitude: ")
    val magnitude = readLine()?.toDouble() ?: throw Exception()

    val url = URL("$endPoint&starttime=$startTime&minmagnitude=$magnitude")

    try {
        val jsonResponse = url.readText()
        earthquakes = parseEarthquakeData(jsonResponse)
    } catch (e: Exception) {
        println(e.message)
        System.err.println("Invalid entry")
    }

    earthquakes?.sortedBy { it.properties.mag }?.takeLast(10)?.forEach(::println)
}

fun parseEarthquakeData(response: String): List<Earthquake> {
    val klaxon = Klaxon()
    val parsed = klaxon.parseJsonObject(StringReader(response))
    val parsedArray = parsed.array<Any>("features")

    return parsedArray?.let { klaxon.parseFromJsonArray<Earthquake>(it) } ?: throw Exception()
}