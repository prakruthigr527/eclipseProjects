package com.example.demo;

import com.example.demo.linkedList.Queue;
import com.example.demo.linkedList.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		LinkedList linkedList= new LinkedList();
//		linkedList.insert("first",linkedList);
//		linkedList.insert("second",linkedList);
//		linkedList.insert("third",linkedList);
//		linkedList.insert("first",linkedList);
//		linkedList.print();
//		linkedList.delete("first");
//		linkedList.delete("third");
//		linkedList.print();
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

/*		CircularLinkedList cll = new CircularLinkedList();
		cll.insert("first");
		cll.insert("second");
		cll.insert("third");
		cll.print();
		cll.delete("second");
		cll.print();
		cll.delete("third");
		cll.print();
		cll.delete("first");
		cll.print();*/

	/*	Stack stack = new Stack();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.print();
		stack.pop();
		stack.print();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();*/

		Queue queue = new Queue();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.print();

	}

}
