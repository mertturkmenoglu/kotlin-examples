package dataStructures.e001_BinaryTree

class BinaryTree<T>(val root: TreeNode<T>) {
    constructor(key: T) : this(TreeNode(key))
}