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

	    // Case 1: Insert at start (pos = 0)
		if(pos==0) {
			addAtBegining(data);
			return ;
		}
		//case 2: insert ad specific position
		Node temp=head;
		int count=0;
		while(count<pos-1) {
			if(temp.next==null) {
				System.out.println("position is beyond size of linkedlist");
				return;
			}
			temp=temp.next;
			count++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
		
		
	}
	
	
	// delete the last element in linked list:
	int deleteLast() {
		if(head==null) {
			return -1;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		int data=temp.next.data;
		
		temp.next=null;
		return data;
	}
	
	//delete the first element in linked list:
	int deleteFirst() {
		if(head==null) {
			return -1;
		}
		Node temp=head;
		int data=temp.data;
//		System.out.println(data);
		head=temp.next;
		return data;
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
		 linkedList.addAtEnd(10);
		 linkedList.addAtEnd(20);
		 linkedList.addAtEnd(30);
//		 linkedList.display();
//		 System.out.println();
//		 linkedList.addAtBegining(40);
//		 linkedList.addAtBegining(50);
//		 linkedList.addAtBegining(60);
//		 linkedList.addAtPosition(2, 100);
//		 linkedList.display();
//		 System.out.println(linkedList.deleteLast());
		 linkedList.deleteLast();
		System.out.println( linkedList.deleteFirst());;
 		 linkedList.display();

	}
}
