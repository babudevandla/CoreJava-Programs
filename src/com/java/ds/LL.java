package com.java.ds;

public class LL {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	Node tail;

	int size = 0;

	public static void main(String[] args) {
		LL ll = new LL();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40, 0);
		ll.add(60, 2);
	}

	private void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		System.out.println(this);
	}

	private void add(int data, int index) {

		if (index < 0 && index > (size - 1)) {
			System.out.println("Index out if range ");
			return;
		}

		Node curr = head;
		Node prev = null;
		int i = 0;
		while (curr != null && i != index) {
			prev = curr;
			curr = curr.next;
			i++;
		}
		Node newNode = new Node(data);

		if (prev == null) {
			newNode.next = head;
			head = newNode;
		} else {
			prev.next = newNode;
			newNode.next = curr;
		}
		size++;
		System.out.println(this);
	}

	@Override
	public String toString() {
		StringBuffer br = new StringBuffer();
		br.append("[");

		Node curr = head;
		if (head == null) {
			System.out.println("List is empty..");
		}

		while (curr != null) {
			br.append(curr.data).append(",");
			curr = curr.next;
		}

		if (br.length() > 1) {
			br.deleteCharAt(br.length() - 1);
		}
		br.append("]");

		return br.toString();
	}
}
