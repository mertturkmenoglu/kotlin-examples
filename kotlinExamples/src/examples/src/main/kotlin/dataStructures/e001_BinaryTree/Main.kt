package dataStructures.e001_BinaryTree

fun main() {
    val tree = BinaryTree("Root")
    tree.root.leftChild = TreeNode("2", TreeNode("4"), TreeNode("5"))
    tree.root.rightChild = TreeNode("3")
    println(tree.root)
    println(tree.root.leftChild)
}