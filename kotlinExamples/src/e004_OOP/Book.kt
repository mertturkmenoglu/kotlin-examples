package e004_OOP

open class Book(var title: String="", var author: String="") {

    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(): Book() {

    private var wordCount = 0
    override fun readPage() {
        wordCount += 255
    }
}