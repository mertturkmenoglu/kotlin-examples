package languageExamples.coroutines.e011_AsyncAwait

import com.beust.klaxon.Klaxon
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.net.URL

data class Repository(val id: Number, val node_id: String, val name: String, val full_name: String)

fun main() {
    println("Enter your GitHub username: ")
    val userName = readLine() ?: throw Exception()

    val jsonResponse = GlobalScope.async { URL("https://api.github.com/users/$userName/repos").readText() }

    println("It will continue")

    runBlocking {
        val klaxon = Klaxon()
        println("Before parse")
        val repos = klaxon.parseArray<Repository>(jsonResponse.await())
        println("After parse\n\n")
        repos?.forEach { println(it.name) }
    }
}