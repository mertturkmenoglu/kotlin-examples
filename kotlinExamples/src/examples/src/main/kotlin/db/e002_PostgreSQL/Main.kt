package db.e002_PostgreSQL

import java.sql.Connection
import java.sql.DriverManager
import kotlin.properties.Delegates
import kotlin.system.exitProcess

fun main() {
    // Open your database via pgAdmin

    println("User name(default postgres): ")
    val userName = readLine() ?: throw Exception()

    println("Password: ")
    val password = readLine() ?: throw Exception()

    println("Database name: ")
    val dbName = readLine() ?: throw Exception()

    val driverName = "org.postgresql.Driver"
    val url = "jdbc:postgresql://localhost:5432/$dbName"

    var connection by Delegates.notNull<Connection>()

    try {
        Class.forName(driverName)
        connection = DriverManager.getConnection(url, userName, password)
    } catch (e: Exception) {
        e.printStackTrace()
        exitProcess(0)
    }

    println(connection.clientInfo)
    println("Opened database successfully")
}