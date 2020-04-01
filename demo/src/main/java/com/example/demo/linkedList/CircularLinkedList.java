package com.example.demo.linkedList;

import org.apache.commons.lang3.StringUtils;

public class CircularLinkedList {

    Node head;

    public void insert(String value) {

        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        else {
            Node node = head;
            if(head.next == head) {
                head.next = newNode;
                newNode.next = head;
                return;
            }
            while(node.next!=head) {
               node = node.next;
            }
            node.next = newNode;
            newNode.next = head;
        }
    }

    public void print() {
        if (head == null){
            System.out.println("CircularLinkedList is empty");
        } else {
            Node n = head;
            if (n.next == head) {
                System.out.print(n.data);
            } else {
                while (n.next != head) {
                    System.out.print(n.data + ", ");
                    n = n.next;
                }
                System.out.print(n.data);
            }
        }
        System.out.println("\n-----------------****************-------------------");

    }

    public void delete(String value) {
        Node n = head;
        if(StringUtils.isNotEmpty(value) && head != null) {
            if (head.data.equalsIgnoreCase(value)) {
                if(n.next == head) {
                    head = null;   // this loop is used to remove the final element in list
                } else {
                    while (n.next != head) {
                        n=n.next;
                    }// need to traverse whole loop to update the last element's next locaton as head
                    head = head.next;
                    n.next=head;
                }
            }
            else {
                while (n.next != head) { //checking in other elements
                    if(n.next.data.equalsIgnoreCase(value)) {
                        n.next=n.next.next;
                        return;
                    } else {
                        System.out.println("value " + value + " not found" );
                    }
                    n = n.next;
                }

            }
        }
    }



}
