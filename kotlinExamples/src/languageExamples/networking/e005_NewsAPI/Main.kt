// Powered by News API
// https://newsapi.org/

package languageExamples.networking.e005_NewsAPI

import com.beust.klaxon.Klaxon
import java.io.StringReader
import java.net.URL

data class News(val author: String, val title: String)

@Suppress("LocalVariableName")
fun main() {
    val API_KEY = "YOUR_API_KEY_GOES_HERE" // [YOUR API KEY GOES HERE]

    println("Search for news: ")
    val search = readLine() ?: throw Exception()

    val url = URL("https://newsapi.org/v2/everything?q=$search&apiKey=$API_KEY")

    val response = url.readText()
    val klaxon = Klaxon()
    val parsed = klaxon.parseJsonObject(StringReader(response))
    val articles = parsed.array<Any>("articles")
    val news = articles?.let { klaxon.parseFromJsonArray<News>(it) }

    news?.forEach {
        println("Author: ${it.author}")
        println("Title: ${it.title}")
        println("================")
    }
}