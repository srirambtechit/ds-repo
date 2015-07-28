package com.datastructure.list;

public class SingleLinkedList {

	private LinkedListNode head;

	private int size;

	public int count() {
		return this.size;
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
		this.size++;
	}

	public void deleteList() {
		LinkedListNode t = head;
		while (t != null) {
			t = t.next;
			if (t != null) {
				t.next = null;
			}
		}
		t = null;
		System.out.println("DL : " + head);
	}

	/**
	 * <pre>
	 * @param n  - is an index of element in the list
	 * @return - element present at index, null if not
	 * </pre>
	 */
	public Integer getNth(int n) {
		if (n < 0)
			throw new IndexOutOfBoundsException(String.format("%d < 0", n));

		if (head == null)
			return null;

		LinkedListNode t = head;
		while (t != null && n > 0) {
			t = t.next;
			n--;
		}
		return t.data;
	}

	public String toString() {
		if (head == null)
			return "[]";
		return "[" + head.toString() + "]";
	}

}
