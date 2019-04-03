import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {

    val rollDice1 = { random()%12+1 }
    val rollDice2 = { sides: Int ->
        Random().nextInt(12)+1
    }
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    val rollDice3: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
}