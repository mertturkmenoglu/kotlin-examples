package e035_HTTPRequest

import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://api.github.com/search/repositories?q=kotlin&sort=stars&order=desc")

    with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        println("URL: $url\nResponse Code: $responseCode")

        val strBuilder = StringBuilder()
        inputStream.bufferedReader().use {
            it.lines().forEach { line ->
                strBuilder.append(line)
            }
        }
    }
}