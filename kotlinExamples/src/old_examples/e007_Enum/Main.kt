package old_examples.e007_Enum

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {

    var path: MutableList<Direction> = mutableListOf(Direction.START)
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    val end = {
        path.add(Direction.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }

}

fun main() {
    val myGame = Game()
    println(myGame.path)
    myGame.north()
    myGame.east()
    myGame.south()
    myGame.west()
    myGame.end()
    println(myGame.path)
}