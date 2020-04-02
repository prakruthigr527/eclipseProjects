package com.example.demo.linkedList;

public class Stack {
    Node topOfTheStack;
    public void push(String value) {
        Node newNode = new Node(value);
        if(topOfTheStack == null) {
            topOfTheStack=newNode;
        } else {
            Node temp = topOfTheStack;
            topOfTheStack = newNode;
            topOfTheStack.next=temp;
        }
    }
    public void pop(){
        if(topOfTheStack != null) {
            topOfTheStack = topOfTheStack.next;
        }
        else {
            System.out.println("Stack is empty");
        }
    }
    public String peek(){
        if(topOfTheStack != null) {
            System.out.println( "Top of the Stack data = "+ topOfTheStack.data);
             return topOfTheStack.data;
        }
       return null;
    }

    public void print(){
       Node n= topOfTheStack;
       while(n!=null){
           System.out.print(n.data+ " -> ");
           n=n.next;
       }
       System.out.println("\n--------*********----------*********--------");
    }
}
