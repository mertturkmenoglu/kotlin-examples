package db.e001_SQLite

import java.sql.DriverManager
import java.sql.SQLException

fun main() {
    Connect.connect()
}

class Connect {
    companion object {
        @JvmStatic
        fun connect() {
            @Suppress("SpellCheckingInspection")
            val url = "jdbc:sqlite:${System.getProperty("user.dir")}/test.db"

            try {
                val connection = DriverManager.getConnection(url)
                println("Connection established")
                connection.close()
            } catch (e: SQLException) {
                e.printStackTrace()
            }
        }
    }
}