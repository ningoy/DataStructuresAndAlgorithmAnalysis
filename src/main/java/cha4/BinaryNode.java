package cha4;

public class BinaryNode<AnyType> {
    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;

    /**
     * Constructors
     * @param theElement The data in the node
     */
    BinaryNode(AnyType theElement) {
        this(theElement, null, null);
    }

    BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
        element = theElement;
        left = lt;
        right = rt;
    }
}
