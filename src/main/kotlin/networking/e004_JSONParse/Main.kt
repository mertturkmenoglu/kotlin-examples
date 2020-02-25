package networking.e004_JSONParse

import com.beust.klaxon.Klaxon
import java.net.HttpURLConnection
import java.net.URL

data class Repository(val id: Number, val node_id: String, val name: String, val full_name: String)

fun main() {
    println("Enter your GitHub username: ")
    val username = readLine() ?: throw Exception()
    val url = URL("https://api.github.com/users/$username/repos")

    val jsonResponse = with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"

        val strBuilder = StringBuilder()
        inputStream.bufferedReader().use { it.lines().forEach { line -> strBuilder.append(line) } }

        strBuilder.toString()
    }

    val klaxon = Klaxon()
    val repos = klaxon.parseArray<Repository>(jsonResponse)

    repos?.forEach { println(it.name) }
}