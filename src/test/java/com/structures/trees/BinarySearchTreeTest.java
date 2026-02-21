package com.structures.trees;

import com.structures.binaryTree.BinarySearchTree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.preorder();
        System.out.println("-----------------------------------------");
        tree.remove(3);
        tree.preorder();
        System.out.println("-----------------------------------------");
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.preorder();
        System.out.println("-----------------------------------------");
        tree.remove(8);
        tree.preorder();
        System.out.println("-----------------------------------------");
    }
}