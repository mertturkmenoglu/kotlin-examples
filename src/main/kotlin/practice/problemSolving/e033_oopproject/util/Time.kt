package practice.problemSolving.e033_oopproject.util

class Time(private var hour: Int = 0, private var minute: Int = 0) {
    fun getDifference(other: Time): Int {
        var diff = 0
        if (this.hour >= other.hour) {
            diff += 60 * (this.hour - other.hour)
            diff += this.minute - other.minute
        } else {
            diff = -1
        }
        return diff
    }

    override fun toString() = "$hour : $minute"
}