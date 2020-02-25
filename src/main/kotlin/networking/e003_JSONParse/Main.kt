package networking.e003_JSONParse

import com.beust.klaxon.JsonReader
import com.beust.klaxon.Klaxon
import java.io.StringReader
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
    val repos = ArrayList<Repository>()

    JsonReader(StringReader(jsonResponse)).use { reader ->
        reader.beginArray {
            while (reader.hasNext())
                repos.add(klaxon.parse<Repository>(reader) ?: throw Exception())
        }
    }

    repos.forEach { println(it.name) }
}