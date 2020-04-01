package com.example.demo;

import com.example.demo.doublyLinkedList.DoublyLinkedList;
import com.example.demo.linkedList.CircularLinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.linkedList.LinkedList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		LinkedList linkedList= new LinkedList();
		linkedList.insert("first",linkedList);
		linkedList.insert("second",linkedList);
		linkedList.insert("third",linkedList);
		linkedList.insert("first",linkedList);
		linkedList.print();
		linkedList.delete("first");
		linkedList.delete("third");
		linkedList.print();
/*
		DoublyLinkedList dll = new DoublyLinkedList();
		//inset at the head
		dll.insert(dll,"first", "start",null);
		//insert in front of node
		dll.insert(dll,"second", "start", dll.head);
		//insert at the end
		dll.insert(dll,"third", "end",null);
		//insert at the end of given node
		dll.insert(dll,"fourth", "end",dll.head.next);
		dll.print(dll.head);

		dll.delete(dll.head.next.next);
		dll.print(dll.head);
*/

		CircularLinkedList cll = new CircularLinkedList();
		cll.insert("first");
		cll.insert("second");
		cll.insert("third");
		cll.print();
		cll.delete("second");
		cll.print();
		cll.delete("third");
		cll.print();
		cll.delete("first");
		cll.print();
	}


}
