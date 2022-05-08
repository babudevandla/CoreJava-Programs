package com.java.ds;

public class LinkedListExample {

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public static void main(String[] args) {

		LinkedListExample ll=new LinkedListExample();
		ll.add(10);
		ll.printMiddleEle();
	}
	private void printMiddleEle() {
		Node nod1=head;
		
		Node nod2=head; 
		if(head!=null) {
			while(nod2!=null && nod2.next!=null) {
				nod2=nod2.next.next;
				nod1=nod1.next;
			}
			System.out.println(nod1.next);
		}
		
	}
	
	int getIntersection(Node node1,Node node2) {
		
		Node cur1=node1;
		Node cur2=node2;
		for(int i=0;i<cur2.data;i++) {
			 if(cur1==null)
				 return -1;
			cur1=cur1.next;  // 
		}
		
		while(cur1!=null &&cur2!=null) {
			if(cur1.data==cur2.data) {
				return cur1.data;
			}
			cur1=cur1.next;
			cur2=cur2.next;
		}
		
		return 0;
		
	}
	private void add(int data) {
		
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			head.next=newNode;
			tail.next=newNode;
		}
	}
	

}
