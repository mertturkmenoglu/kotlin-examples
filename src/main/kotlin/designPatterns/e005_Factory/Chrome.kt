package designPatterns.e005_Factory

class Chrome : WebBrowser {
    override val name: String = "Chrome"

    override fun specification(): String {
        return "Chrome Web Browser Build: X"
    }
}