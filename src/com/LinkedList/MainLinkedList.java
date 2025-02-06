package com.LinkedList;
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class SingleLinkedList{
	Node head;
	public void insert(int data) {
		Node curr = head;
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+ "   ");
			curr = curr.next;
		}
		System.out.println();
	}
	public void size() {
		Node curr = head;
		int size = 0;
		while(curr != null) {
			curr = curr.next;
			size++;
		}
		System.out.println("Size : "+size);
	}
	public void search(int data) {
		Node curr = head;
		while(curr != null) {
			if(curr.data == data) {
				System.out.println("Element Found ");
				return;
			}
			else {
				curr = curr.next;
			}
		}
		System.out.println("Element Not Found");	
	}
	
}

public class MainLinkedList {
	
	public static void main(String[] args) {		
		
		SingleLinkedList sll = new SingleLinkedList();
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		sll.display();
		sll.size();
		sll.search(10);
		sll.search(100);
		
	}

}
