package db.e005_Mongo

import com.mongodb.MongoClient

fun main() {
    println("DB name: ")
    val dbName = readLine() ?: throw Exception("Invalid input")

    println("Collection name: ")
    val collectionName = readLine() ?: throw Exception("Invalid input")

    println("Field name: ")
    val fieldName = readLine() ?: throw Exception("Invalid input")

    // By default, it will connect to localhost(default) Mongo Client
    // You can supply a Client URI to connect to another client.
    val mongoClient = MongoClient()
    val kotlinTestDB = mongoClient.getDB(dbName)

    val queryResult = kotlinTestDB
            .getCollection(collectionName)
            .find()?.one()?.get(fieldName)

    println(queryResult)

    mongoClient.close()
}