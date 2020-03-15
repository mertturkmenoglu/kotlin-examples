package designPatterns.e005_Factory

interface WebBrowser {
    val name: String

    fun specification(): String

    fun openURL(url: String): String {
        return "Opening $url with $name"
    }
}