package example_20

// Referential equality operator example
fun main() {
    val firstBook = Book("The Silmarillion","J.R.R. Tolkien", 443)
    val secondBook = Book("A Game of Thrones", "George R. R. Martin", 694)

    firstBook.printBookInfo()
    secondBook.printBookInfo()

    // Two different objects with different states
    print("isEqual: ")
    val isEqual1 = (firstBook === secondBook)
    println(isEqual1)

    // Assigning a reference of a memory location to a pointer
    val thirdBook = firstBook
    thirdBook.printBookInfo()
    print("isEqual: ")
    val isEqual2 = (firstBook === thirdBook)
    println(isEqual2)

    // Creating a new object with the same states
    val fourthBook = firstBook.clone()
    fourthBook.printBookInfo()
    print("isEqual: ")
    val isEqual3 = (firstBook === fourthBook)
    println(isEqual3)
}