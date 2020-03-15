package designPatterns.e005_Factory

fun main() {
    val chrome = WebBrowserFactory.getBrowser("Chrome")
    println(chrome.openURL("https://github.com/"))

    val firefox = WebBrowserFactory.getBrowser("Firefox")
    println(firefox.openURL("https://google.com/"))

    val opera = WebBrowserFactory.getBrowser("Opera")
    println(opera.specification())

    val default = WebBrowserFactory.getBrowser("")
    println(default.name)
    println(default.specification())
    println(default.openURL("https://en.wikipedia.org/"))
}