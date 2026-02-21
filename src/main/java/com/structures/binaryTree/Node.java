package com.structures.binaryTree;

public class Node {

    int value;
    Node left;
    Node right;

    public Node(int data){
        this.value = data; // the data inside this node
        this.right = null; // left node starts as null;
        this.left = null; // right node starts as null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
