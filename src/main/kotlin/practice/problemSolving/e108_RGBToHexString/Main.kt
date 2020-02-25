package practice.problemSolving.e108_RGBToHexString

fun main() {
    val result = rgb(255, 0, 128)
    println(result)
}

@Suppress("SameParameterValue")
private fun rgb(r: Int, g: Int, b: Int): String {
    require (r in 0..255 && g in 0..255 && b in 0..255) { "Invalid color" }

    return "#" + listOf(r, g, b).joinToString(separator = "") {
        val hex = Integer.toHexString(it).toUpperCase()
        if (hex.length < 2) { "0$hex" } else { hex }
    }
}