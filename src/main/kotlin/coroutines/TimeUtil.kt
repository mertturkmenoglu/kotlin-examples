package coroutines

import java.time.LocalTime

object TimeUtil {
    fun getCurrentTimeFormatted(): String {
        val time = LocalTime.now()
        return "${time.hour}:${time.minute}:${time.second}"
    }
}