package Person

fun main(args: Array<String>) {

    val mert = Person("mert", 20, true)
    val zeynep = Person("zeynep")

    println(mert.name + mert.age.toString() + mert.gender.toString())
    println(zeynep.name + zeynep.age.toString() + zeynep.gender.toString())

}