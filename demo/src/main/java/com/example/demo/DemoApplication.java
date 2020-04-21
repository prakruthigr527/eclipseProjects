package com.example.demo;

import com.example.demo.doublyLinkedList.BinaryTree;
import com.example.demo.doublyLinkedList.Node;
import com.example.demo.linkedList.Queue;
import com.example.demo.linkedList.Stack;
import com.example.demo.sortingAlgorithms.Sort;
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

	/*	Queue queue = new Queue();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.print();*/

		/*BinaryTree tree = new BinaryTree(new Node("Ancient"));
		tree.getRoot().setLeft(new Node("great grand father"));
		tree.getRoot().setRight(new Node(" great grand mother"))*/
		;

	/*	int arr[] = {5,8,2,0,1,9,6};
		*//*Sort.print(arr, "Before Bubble Sort");
		Sort.bubbleSort(arr);
		Sort.print(arr, "After Bubble Sort");
		arr = new int [] {5,8,2,0,1};
		Sort.print(arr, "Before Selection Sort");
		Sort.selectionSort(arr);
		Sort.print(arr, "After Selection Sort");
		arr = new int [] {5,8,2,0,1};*//*
		Sort.print(arr, "Before Insertion Sort");
		Sort.insertionSort(arr);
		Sort.print(arr, "After Insertion Sort");
		arr = new int [] {5,8,2,0,1,9,6};
		Sort.print(arr, "Before Insertion Sort 1");
		Sort.insertionSort(arr);
		Sort.print(arr, "After Insertion Sort 2");*/


//Given a random alpha-numeric string with no special characters, reformat the string without adding or removing
//        any characters so that no alphabet characters are adjacent to any other alphabet characters and no numeric characters
//        are adjacent to any other numeric characters, if possible, and return the modified string. If it is not possible to reformat
//        the string in that way, then group all the alphabet characters at the beginning of the string and all numeric characters at
//        the end of the string. In either case keep all alphabet characters in the same order relative to each other before and after
//        the formatting and also keep all numeric characters in the same order releative to each other before and after the formatting.
//        */

		String input = "aabb12cc345";
		char[] inputArray = input.toCharArray();
		System.out.println(inputArray);

		char[] outputNumberArray = new char[input.length()];
		char[] outputAlphabetArray = new char[input.length()];
		int count=0, j=input.length();
		for (int i=0 ;i<input.length();i++){
			if(!alphabetic(input.charAt(i))) {
				outputNumberArray[j] = inputArray[i];
				j--;
			}
			else {
				outputAlphabetArray[count] = inputArray[i];
				count++;
			}
		}
		input = new String(outputAlphabetArray) + new String(outputNumberArray);
		System.out.println(input);
		input = input.substring(0,count) + input.substring(input.length()-j, input.length());
		System.out.println(input);


	}

	static boolean alphabetic(char alphabet){

		if((alphabet > 64 && alphabet<=90)||(alphabet > 96 && alphabet<=122)){
			return true;
		}
		return false;

	}
}