package com.example.demo.doublyLinkedList;

public class Node {
    Node left, right;
    String data;

    public Node(String data){
        this.data=data;
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