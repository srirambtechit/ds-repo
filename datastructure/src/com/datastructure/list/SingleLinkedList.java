package com.datastructure.list;

public class SingleLinkedList {

	private LinkedListNode head;

	private int size;

	public int size() {
		return size;
	}

	public void add(Integer data) {
		if (head == null) {
			head = new LinkedListNode(data, null);
		} else {
			LinkedListNode node = new LinkedListNode(data, null);
			LinkedListNode t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = node;
		}
		size++;
	}

	public String toString() {
		if (head == null)
			return "[]";
		return "[" + head.toString() + "]";
	}
}
