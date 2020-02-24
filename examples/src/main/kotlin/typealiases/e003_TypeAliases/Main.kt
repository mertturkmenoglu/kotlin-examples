package typealiases.e003_TypeAliases

// This code demonstrates problems about type aliases

typealias Latitude = Double
typealias Longitude = Double

fun printCoordinates(lat: Latitude, lng: Longitude) {
    println("($lat, $lng)")
}

fun main() {
    val lat: Latitude = 60.0124
    val lng: Longitude = 29.7336
    
    printCoordinates(lng, lat)
}

