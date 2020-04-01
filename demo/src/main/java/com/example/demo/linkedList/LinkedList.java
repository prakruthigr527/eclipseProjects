package com.example.demo.linkedList;

public class LinkedList {
    private Node head;
    public void insert(String value, LinkedList linkedList) {
        Node new_node = new Node(value);
        new_node.next = null;
        if (head == null) {
            linkedList.head = new_node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }
    }
    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    public void delete (String key) {
        Node currentNode = head, prevNode = null;
        if(head!=null && currentNode.data.equals(key)) {
            head = currentNode.next;
            return;
        }
        while(currentNode!=null && !currentNode.next.data.equals(key)) {
            //prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode!=null) {
            currentNode.next = currentNode.next.next;
        } else {
            System.out.println();
            System.out.println("Key " + key + " NOT Found");
        }
    }
}
