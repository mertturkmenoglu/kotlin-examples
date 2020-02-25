package dataStructures.e001_BinaryTree

class TreeNode<T>(val key: T, var leftChild: TreeNode<T>? = null, var rightChild: TreeNode<T>? = null) {
    override fun toString(): String {
        return "(Node=$key, Left=${leftChild?.key}, Right=${rightChild?.key})"
    }
}