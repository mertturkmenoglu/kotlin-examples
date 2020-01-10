package practice.problemSolving.e042_NameInString

fun main() {
    val text = "Across the rivers"
    val name = "chris"
    val result = nameInString(text, name)
    println(result)
}

fun nameInString(text: String, name: String): Boolean {
    val textIterator = text.split("").filterNot { it == " " || it == "" }.map { it.first() }.listIterator()
    val nameIterator = name.split("").filterNot { it == " " || it == "" }.map { it.first() }.listIterator()

    var t: Char
    var n = nameIterator.next()

    while (textIterator.hasNext()) {
        t = textIterator.next()
        if (t == n) {
            if (nameIterator.hasNext())
                n = nameIterator.next()
            else
                return true
        }
    }

    return false
}