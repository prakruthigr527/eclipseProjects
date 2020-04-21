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
                        head.right = tempNode;
                        tempNode.left = head;
                        break;
                    } else {
                        Node tempNode = nodeLocation.left;
                        tempNode.right = newNode;
                        newNode.right=nodeLocation;
                        newNode.left=tempNode;
                        nodeLocation.left = newNode;
                        break;
                    }
                }
                case "end"   : {
                        Node node = head;
                        if (nodeLocation==null) {
                            while (node.right != null) {
                            node = node.right;
                            }
                            node.right = newNode;
                            newNode.left = node;
                            break;
                        } else {
                            Node tempNode = nodeLocation.right;
                            nodeLocation.right=newNode;
                            newNode.right=tempNode;
                            newNode.left=nodeLocation;
                            if(tempNode!=null)
                                tempNode.left=newNode;
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
            n = n.right;
        }
        System.out.println();
        while(last!=null) {
            System.out.print(last.data + " ");
            last =last.left;
        }
        System.out.println();
        System.out.println("--********--*********--**********--");
    }

    public void delete(Node nodeLocation){

        if(head==null || nodeLocation == null) {
            return;
        }
        if(nodeLocation == head){
            head = nodeLocation.right;
        }

        if(nodeLocation.left != null) {
            nodeLocation.left.right = nodeLocation.right;
            nodeLocation.right.left = nodeLocation.left;
        }
    }


}
