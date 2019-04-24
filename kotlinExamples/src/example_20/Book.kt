package example_20

class Book(private val name: String?, private val author: String?, private val pageCount: Int = 0) {
    fun printBookInfo() {
        println("Name: $name\tAuthor: $author\tPage Count: $pageCount")
    }

    fun clone() : Book {
        return Book(name, author, pageCount)
    }
}