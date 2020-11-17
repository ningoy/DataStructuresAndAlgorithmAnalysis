package cha4;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    private static class BinaryNode<AnyType> {

        /**
         * Constructors
         *
         * @param theElement
         */
        BinaryNode(AnyType theElement) {
            this(theElement, null, null);
        }

        BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
            element = theElement;
            left = lt;
            right = rt;
        }

        AnyType element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;
    }

    private BinaryNode<AnyType> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(AnyType x) {
        return contains(x, root);
    }

    /**
     * 在子树中搜索一个元素的内部方法
     *
     * @param x 要搜索的元素
     * @param t 子树的根节点
     * @return 如果找到 返回 true 否则返回 false
     */
    private boolean contains(AnyType x, BinaryNode<AnyType> t) {
        if (t == null) {
            return false;
        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {
            return contains(x, t.left);
        } else if (compareResult > 0) {
            return contains(x, t.right);
        } else {
            // Match
            return true;
        }
    }
}
