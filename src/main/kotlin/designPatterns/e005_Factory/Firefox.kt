package designPatterns.e005_Factory

class Firefox : WebBrowser {
    override val name: String = "Firefox"

    override fun specification(): String {
        return "Firefox Web Browser Build: Y"
    }
}