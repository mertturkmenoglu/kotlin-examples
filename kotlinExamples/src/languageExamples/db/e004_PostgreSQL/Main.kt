package languageExamples.db.e004_PostgreSQL

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import kotlin.system.exitProcess


@Suppress("SpellCheckingInspection")
fun main() {
    println("User name(default postgres): ")
    val userName = readLine() ?: throw Exception()

    println("Password: ")
    val password = readLine() ?: throw Exception()

    println("Database name: ")
    val databaseName = readLine() ?: throw Exception()

    val connection: Connection?
    val statement: Statement?
    val driverName = "org.postgresql.Driver"

    val url = "jdbc:postgresql://localhost:5432/$databaseName"

    val query = """
        SELECT * FROM employee
        ORDER BY bdate ASC
        LIMIT 1;
    """.trimIndent()

    try {
        Class.forName(driverName)
        connection = DriverManager.getConnection(url, userName, password)
        connection.autoCommit = false

        statement = connection.createStatement()
        val resultSet = statement.executeQuery(query)

        var i = 0
        while (resultSet.next() && i < 10) {
            with(resultSet) {
                println("fname: ${getString("fname")}")
                println("minit: ${getString("minit")}")
                println("lname: ${getString("lname")}")
                println("ssn: ${getString("ssn")}")
                println("sex: ${getString("sex")}")
                println("salary: ${getInt("salary")}")
                println("dno: ${getInt("dno")}")
                println("------------")
            }

            i++
        }

        resultSet.close()
        statement.close()
        connection.close()
    } catch (e: Exception) {
        e.printStackTrace()
        exitProcess(0)
    }

    println("Operation done successfully")
}