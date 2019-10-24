package languageExamples.designPatterns.e002_Iterator

data class Book(val name: String)

class Library(private val books: MutableList<Book> = mutableListOf()) : Iterable<Book> {
    override fun iterator(): Iterator<Book> = LibraryIterator(books)
}

class LibraryIterator(private val books: MutableList<Book> = mutableListOf(), var current: Int = 0) : Iterator<Book> {
    override fun hasNext(): Boolean = books.size > current
    override fun next(): Book {
        return books[current++]
    }
}

fun main() {
    val novellas = Library(mutableListOf(Book("Les Miserables"), Book("War and Peace")))
    novellas.forEach(::println)
}