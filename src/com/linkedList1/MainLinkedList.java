package com.linkedList1;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
class SingleLinkedList{
	Node head;
	public void insert(int data) {
		Node newNode = new Node(data);
		Node curr = head;
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
	
	public void insertBegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
	}
}
public class MainLinkedList {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		sll.insertBegin(5);
		sll.display();
	}
}
