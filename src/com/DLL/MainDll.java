package com.DLL;
class DoublyLinkedList{
	class Node{
		Node prev;
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	int size = 0;
	Node head;
	Node tail;
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			size++;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}
		
	}
	
	public void display() {
		Node curr = head;
		System.out.print("Forward : ");
		while(curr != null) {
			System.out.print(curr.data+ " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	public void displayReverse() {
		Node curr = tail;
		System.out.print("Backward : ");
		while(curr != null) {
			System.out.print(curr.data+ " <- ");
			curr = curr.prev;
		}
		System.out.println("null");
	}
	
	public void insertBegin(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			size++;
		}
		else {	
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			size++;
		}
	}

	public void deleteEnd() {
		if(tail == null) {
			System.out.println("DLL is Empty");
		}
		else if(head == tail) {
			head = null;
			tail = null;
			size--;
		}
		else {
			tail = tail.prev;
			tail.next = null;
			size--;
		}
	}
	
	public void deleteBegin() {
		if(head == null) {
			System.out.println("DLL is Empty");
		}
		else if(head == tail) {
			head = null;
			tail = null;
			size--;
		}
		else {
			head = head.next;
			head.prev = null;	
			size--;
		}
		
		
	}

	public void size() {
		
		System.out.println("Size of DLL : "+ size);
		
	}
	

}
public class MainDll {
	
	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertLast(10);
		dll.insertLast(20);
		dll.insertLast(30);
		dll.display();
		dll.displayReverse();
		System.out.println("---------------------------");
		dll.insertBegin(5);
		dll.display();
		dll.displayReverse();
		dll.deleteEnd();
		System.out.println("----------------------------");
		dll.display();
		dll.displayReverse();
		dll.deleteBegin();
		System.out.println("----------------------------");
		dll.display();
		dll.displayReverse();
		dll.size();
		
	}
}
