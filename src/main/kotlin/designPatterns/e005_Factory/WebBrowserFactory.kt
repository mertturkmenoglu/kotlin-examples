package designPatterns.e005_Factory

object WebBrowserFactory {
    fun getBrowser(browserName: String): WebBrowser {
        return when (browserName.toLowerCase().capitalize()) {
            "Chrome" -> Chrome()
            "Firefox"-> Firefox()
            "Opera" -> Opera()
            else -> object : WebBrowser {
                override val name: String = "Default"

                override fun specification(): String {
                    return "Default"
                }
            }
        }
    }
}