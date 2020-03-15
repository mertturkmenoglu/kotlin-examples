package designPatterns.e005_Factory

class Opera : WebBrowser {
    override val name: String = "Opera"

    override fun specification(): String {
        return "Opera Web Browser Build: Z"
    }
}