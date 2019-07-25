package old_examples.e004_OOP

@Suppress("unused")
open class Book(var title: String="", var author: String="") {
    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class EBook : Book() {
    private var wordCount = 0
    override fun readPage() {
        wordCount += 255
    }
}