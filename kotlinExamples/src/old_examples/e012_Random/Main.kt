package old_examples.e012_Random

import java.lang.Math.random
import java.util.*

@Suppress("UNUSED_VARIABLE")
fun main() {

    val rollDice1 = { random()%12+1 }
    val rollDice2 = { Random().nextInt(12)+1 }
    val rollDice0 = { sides: Int ->
        if (sides == 0)
            0
        else
            Random().nextInt(sides) + 1
    }

    val rollDice3: (Int) -> Int = { sides ->
        if (sides == 0)
            0
        else
            Random().nextInt(sides) + 1
    }
}