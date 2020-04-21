package com.example.demo.doublyLinkedList;

public class BinaryTree {
    private Node root;
    public BinaryTree(Node n) {
        this.root = n;
    }
    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
