package dsl.e004_TreeStructure

class Tree(val name: String) {
    private val children = mutableListOf<Tree>()

    fun node(name: String, init: (Tree.() -> Unit)? = null) {
        val child = Tree(name)
        children.add(child)

        if (init != null)
            child.init()
    }

    fun printTree() {
        println(name)
        printChildren()
    }

    private fun printChildren(inline: Int = 0) {
        for (child in children) {
            println("${"\t".repeat(inline)}|-> ${child.name}")
            if (child.children.isNotEmpty()) {
                child.printChildren(inline+1)
            }
        }
    }
}

fun tree(name: String, init: (Tree.() -> Unit)? = null): Tree {
    val root = Tree(name)

    if (init != null)
        root.init()

    return root
}

fun main() {
    val t = tree("Comic Books") {
        node("DC") {
            node("Batman") {
                node("Robin")
                node("Alfred")
            }
            node("Superman")
        }

        node("Marvel") {
            node("Captain America")
            node("Captain Marvel")
        }
    }

    t.printTree()
}