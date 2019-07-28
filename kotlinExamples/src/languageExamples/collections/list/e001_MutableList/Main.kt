package languageExamples.collections.list.e001_MutableList

fun main() {
    val mList = mutableListOf<String>()
    mList.add("emily")
    mList.add("barbara")
    println(mList)
    mList.add(1, "diana")
    println(mList)

    mList.addAll(listOf("selina", "dinah", "lois"))
    println(mList)

    val iter = mList.listIterator()

    while(iter.hasNext()) {
        print(iter.next())
        print('\t')
    }

    println()

    mList.removeAt(4)
    println(mList)
    mList.remove("emily")
    println(mList)
    mList.removeAll(listOf("barbara", "diana"))
    println(mList)

    mList.retainAll(setOf("lois"))
    println(mList)

    mList.addAll(listOf("", ""))

    @Suppress("ReplaceGetOrSet")
    mList.set(1, "emily")
    mList[2] = "diana"

    println(mList)
}