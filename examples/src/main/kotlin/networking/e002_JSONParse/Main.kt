package networking.e002_JSONParse


import com.beust.klaxon.Klaxon

data class Repository(val id: Number, val node_id: String, val name: String, val full_name: String)

fun repositoryToJSON(id: Long, node_id: String, name: String, full_name: String): String {
    val repo = Repository(id, node_id, name, full_name)
    return Klaxon().toJsonString(repo)
}

fun main() {
    val jsonString = repositoryToJSON(1L, "node_id", "Repo1", "Repo1 full name")
    println("Json string: $jsonString")
    val jsonResponse = Klaxon().parse<Repository>(jsonString)

    println(jsonResponse?.name)
    println(jsonResponse)
}