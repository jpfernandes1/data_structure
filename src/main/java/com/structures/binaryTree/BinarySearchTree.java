package com.structures.binaryTree;

public class BinarySearchTree {

    // This reference always points to the root of the tree.
    // Every modification must preserve this reference correctly.
    public Node current;

    public void add(int value){
        // Important:
        // We reassign current because the root itself may change
        // (for example, when inserting into an empty tree).
        current = addRecursive(current, value);
    }

    public Node addRecursive(Node current, int value){

        // Base case:
        // If we reach a null position, we create the new node here.
        // This is where the actual insertion happens.
        if(current == null){
            return new Node(value);
        }

        // Recursive descent:
        // We navigate the tree according to BST rules.
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        }

        // Critical concept:
        // We return the current node so the parent call
        // can reconnect the updated subtree correctly.
        // Every recursive call returns the new "top" of that subtree.
        return current;
    }

    // ------------------------ Search -----------------------------------

    public boolean contains(int value){
        return containsRecursive(current, value);
    }

    public boolean containsRecursive(Node current, int value){
        if (current == null) return false;
        if (value == current.value) return true;

        // We eliminate half of the tree at each step.
        // This is why search is O(log n) in a balanced tree.
        return value < current.value
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    // ------------------------ Remove -----------------------------------

    public void remove(int value){
        // Important:
        // Just like add, remove may change the root.
        // Therefore, we must reassign it.
        current = removeRecursive(current, value);
    }

    private Node removeRecursive(Node current, int value){

        // If we reach null, the value does not exist.
        if(current == null) return null;

        // First, we navigate to find the node to remove.
        if(value < current.value) {
            current.left = removeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = removeRecursive(current.right, value);

            // If neither condition occurs, we found the node.
        } else {

            // ---------------- Case 1: No children ----------------
            // The node is a leaf. We simply remove it
            // by returning null to the parent.
            if (current.left == null && current.right == null){
                return null;
            }

            // ---------------- Case 2: One child ----------------
            // We return the existing child so it replaces the current node.
            // The parent call will reconnect automatically.
            if (current.left == null){
                return current.right;
            }

            if (current.right == null){
                return current.left;
            }

            // ---------------- Case 3: Two children ----------------
            // We cannot remove directly because it would break BST rules.
            // Strategy:
            // 1. Find the smallest value in the right subtree (successor).
            // 2. Replace current node's value with it.
            // 3. Remove the duplicate successor node from the right subtree.
            int smallestValue = findMin(current.right);

            // Replace value (structure stays the same for now)
            current.value = smallestValue;

            // Remove the successor node from the right subtree.
            // This call returns the updated right subtree.
            current.right = removeRecursive(current.right, smallestValue);
        }

        // Critical concept:
        // Always return the updated current node.
        // This allows the recursive stack to rebuild the tree
        // correctly from bottom to top.
        return current;
    }

    private int findMin(Node node){

        // In a BST, the minimum value is always
        // the leftmost node of the subtree.
        while(node.left != null){
            node = node.left;
        }
        return node.value;
    }

    // -------------------- Comparing two Binary Trees --------------------

    public boolean equals(BinarySearchTree other){
        return equalsRecursive(this.current, other.current);
    }

    private boolean equalsRecursive(Node node1, Node node2){

        // If both are null, structures match here.
        if (node1 == null && node2 == null) return true;

        // If only one is null, structures differ.
        if (node1 == null || node2 == null) return false;

        // If values differ, trees are not equal.
        if (node1.value != node2.value) return false;

        // Both structure and values must match recursively.
        return equalsRecursive(node1.left, node2.left) &&
                equalsRecursive(node1.right, node2.right);
    }

    // ---------------------- View methods --------------------------------

    public void inorder(){
        inorderRec(current);
    }

    public void inorderRec(Node current){
        if(current != null){

            // Inorder traversal:
            // Left -> Node -> Right
            // In a BST, this prints values in ascending order.
            inorderRec(current.left);
            System.out.println(current.value + " ");
            inorderRec(current.right);
        }
    }

    public void preorder(){
        preorderRec(current);
    }

    public void preorderRec(Node current){
        if(current != null){

            // Preorder traversal:
            // Node -> Left -> Right
            // Useful for copying or serializing the tree.
            System.out.println(current.value + " ");
            preorderRec(current.left);
            preorderRec(current.right);
        }
    }

    public void postorder(){
        postorderRec(current);
    }

    private void postorderRec(Node current){
        if(current != null){

            // Postorder traversal:
            // Left -> Right -> Node
            // Children are processed before the parent.
            postorderRec(current.left);
            postorderRec(current.right);
            System.out.println(current.value + " ");
        }
    }
}