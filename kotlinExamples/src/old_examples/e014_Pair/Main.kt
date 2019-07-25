package old_examples.e014_Pair

fun main() {

    val myBook = Book("Çavdar Tarlasında Çocuklar", "J.D. Salinger", 2014)
    val myPair = myBook.returnPair()
    val myTriple = myBook.returnTriple()

    println("Here is your book ${myPair.first} by ${myPair.second} written in ${myTriple.third}")

}

class Book(private var title: String, private var author: String, private var year: Int)  {

    fun returnPair(): Pair<String, String> = (title to author)
    fun returnTriple(): Triple<String, String, Int> = Triple(title, author, year)

}