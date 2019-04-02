import java.io.File

fun main(args: Array<String>) {
    File("D:\\codes\\kotlin\\kotlin_basics\\src\\example.txt").forEachLine { println(it) }
    val a = 5
    //println("A ${if (a is Int) "is an Integer" else "is not an Integer"}")
    val p = Structure()
    p createPyramid 4

}

class Structure {

    infix fun createPyramid(rows: Int) {

        for (i in 1..rows) {
            var k = 0
            for(space in 1..rows-i)
                print("  ")
            while(k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }

}