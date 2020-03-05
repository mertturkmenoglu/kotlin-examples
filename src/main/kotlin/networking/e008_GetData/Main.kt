package networking.e008_GetData

import com.beust.klaxon.JsonReader
import com.beust.klaxon.Klaxon
import java.io.StringReader
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

data class Repository(val id: Number, val node_id: String, val name: String, val full_name: String)

fun main() {
    @Suppress("LocalVariableName")
    val DATA_URL = "https://api.github.com/users/mertturkmenoglu/repos"

    val response = fetchData(DATA_URL) ?: throw Exception()
    val repositories = getData<Repository>(response.body())

    repositories.forEach { println(it.name) }
}

private inline fun <reified T : Any> getData(json: String): ArrayList<T> {
    val repositories = ArrayList<T>()

    JsonReader(StringReader(json)).use { reader ->
        reader.beginArray {
            while (reader.hasNext())
                repositories.add(Klaxon().parse<T>(reader) ?: throw Exception())
        }
    }

    return repositories
}

@Suppress("SameParameterValue")
private fun fetchData(url: String): HttpResponse<String>? {
    val client = HttpClient.newHttpClient()
    val request = HttpRequest
                                .newBuilder()
                                .uri(URI.create(url))
                                .build()

    return client.send(request, HttpResponse.BodyHandlers.ofString())
}