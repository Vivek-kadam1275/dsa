package com;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	
	void addAtEnd(int data) {
		Node newNode=new Node(data);
		// this is case for empty linked list.
		if(head==null) {
			head=newNode;
			return;
		}
		//won't work for empty stack
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void addAtBegining(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	void addAtPosition(int pos,int data) {
		Node newNode=new Node(data);
		Node temp=head;
		int count=0;
		while(count<pos-1) {
			temp=temp.next;
			count++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
		
		
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList linkedList=new LinkedList();
//		 linkedList.addAtEnd(10);
//		 linkedList.addAtEnd(20);
//		 linkedList.addAtEnd(30);
//		 linkedList.display();
		 System.out.println();
		 linkedList.addAtBegining(40);
		 linkedList.addAtBegining(50);
		 linkedList.addAtBegining(60);
		 linkedList.addAtPosition(2, 100);
		 linkedList.display();
	}
}
