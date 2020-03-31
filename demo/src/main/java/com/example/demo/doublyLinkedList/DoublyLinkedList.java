package com.example.demo.doublyLinkedList;

public class DoublyLinkedList {
    public Node head;

    public DoublyLinkedList insert (DoublyLinkedList dll, String key, String startOrEnd, Node nodeLocation)
    {
        Node newNode = new Node(key);
        // checks if dll is empty
        if (head == null) {
            head = newNode;
            return dll;
        }
        else {
            switch (startOrEnd)
            {
                case "start" : {
                    if (nodeLocation==null || nodeLocation==head) {
                        Node tempNode = head;
                        head = newNode;
                        head.next = tempNode;
                        tempNode.prev = head;
                        break;
                    } else {
                        Node tempNode = nodeLocation.prev;
                        tempNode.next = newNode;
                        newNode.next=nodeLocation;
                        newNode.prev=tempNode;
                        nodeLocation.prev = newNode;
                        break;
                    }
                }
                case "end"   : {
                        Node node = head;
                        if (nodeLocation==null) {
                            while (node.next != null) {
                            node = node.next;
                            }
                            node.next = newNode;
                            newNode.prev = node;
                            break;
                        } else {
                            Node tempNode = nodeLocation.next;
                            nodeLocation.next=newNode;
                            newNode.next=tempNode;
                            newNode.prev=nodeLocation;
                            if(tempNode!=null)
                                tempNode.prev=newNode;
                    }
                }
            }
        }
        return dll;
    }
    public void print(Node n){

        Node last = null;
        while(n!=null){
            System.out.print(n.data + " ");
            last=n;
            n = n.next;
        }
        System.out.println();
        while(last!=null) {
            System.out.print(last.data + " ");
            last =last.prev;
        }
        System.out.println();
        System.out.println("--********--*********--**********--");
    }

    public void delete(Node nodeLocation){

        if(head==null || nodeLocation == null) {
            return;
        }
        if(nodeLocation == head){
            head = nodeLocation.next;
        }

        if(nodeLocation.prev != null) {
            nodeLocation.prev.next = nodeLocation.next;
            nodeLocation.next.prev = nodeLocation.prev;
        }
    }


}
