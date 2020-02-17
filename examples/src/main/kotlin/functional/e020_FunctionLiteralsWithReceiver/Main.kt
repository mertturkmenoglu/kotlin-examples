package functional.e020_FunctionLiteralsWithReceiver

private inline fun <T> T.myApply(block: T.() -> Unit): T {
    println("myApply called!!!")
    block()
    return this
}

private inline fun String.reverseAndApply(block: String.() -> Unit): String {
    return this.reversed().apply(block)
}

private class MyHTML

private class MyBody

private class MyA {
    lateinit var href: String

    fun printA() {
        if (this::href.isInitialized) {
            println("<a href=\"$href\"></a>")
        }
    }
}

private inline fun html(init: MyHTML.() -> Unit): MyHTML {
    val html = MyHTML()
    html.init()
    return html
}

private inline fun body(init: MyBody.() -> Unit): MyBody {
    val body = MyBody()
    body.init()
    return body
}

private inline fun a(init: MyA.() -> Unit): MyA {
    val a = MyA()
    a.init()
    return a
}

fun main() {
    5.myApply {
        println(this)
        println(this + 5)
    }

    println("YLIME".reverseAndApply { plus(" IS THE BEST") })

    html {
        body {
            a {
                href = "http://github.com/mertturkmenoglu"
                printA()
            }
        }
    }
}

