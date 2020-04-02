package com.example.demo.linkedList;

public class Queue {
    Node front;
    Node rear;
    public void enqueue(String value){
        Node newNode = new Node(value);
        if(rear==null && front == null){
            rear = newNode;
            front = newNode;
            front.next = rear;
        }
        else if( front.next == rear) {
            Node temp = rear;
            front.next= temp;
            temp.next = newNode;
            rear = newNode;
        }
        else {
            Node temp = rear;
            temp.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue()
    {
     if(front!=null) {
         front = front.next;
     }
     else {
         System.out.println("Queue is empty");
     }
    }

    public void print()
    {
        Node n = front;
        while(n != null){
            System.out.print(n.data + " <- ");
            n=n.next;
        }
        System.out.println("\n-------xxxxxxxxx--------xxxxxxxx---------");
    }

}
