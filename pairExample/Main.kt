fun main(args: Array<String>) {

    val myBook = Book("Çavdar Tarlasında Çocuklar", "J.D. Salinger", 2014)
    val myPair = myBook.returnPair()
    val myTriple = myBook.returnTriple()

    println("Here is your book ${myPair.first} by ${myPair.second} written in ${myTriple.third}")

}

class Book(var title: String, var author: String, var year: Int)  {

    fun returnPair(): Pair<String, String> = (title to author)
    fun returnTriple(): Triple<String, String, Int> = Triple(title, author, year)

}