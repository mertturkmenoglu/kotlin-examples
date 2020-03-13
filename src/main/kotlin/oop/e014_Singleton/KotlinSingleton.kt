package oop.e014_Singleton

object KotlinSingleton {
    fun create(): String {
        val sb = StringBuilder()

        sb.append("Emily")
        sb.append(" ")
        sb.append("is")
        sb.append(" ")
        sb.append("the")
        sb.append(" ")
        sb.append("best")

        return sb.toString()
    }
}