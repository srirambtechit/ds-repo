package com.datastructure.list;

public class SingleLinkedList {

	private LinkedListNode head;

	private int size;

	/**
	 * Get no. of elements present in the list
	 * 
	 * @return
	 */
	public int count() {
		return this.size;
	}

	/**
	 * Add data to the tail of list
	 * 
	 * @param data
	 */
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

	public void addAt(Integer data, int index) {
		if (index > count() || index < 0)
			throw new IndexOutOfBoundsException(String.format("%d <= size",
					index));
		
		int position = index;
		LinkedListNode t = head;
		for (; t != null && index > 0; t = t.next, index--)
			;

		if (position == 0) {

		}

		LinkedListNode newNode = new LinkedListNode(data, null);
	}

	/**
	 * Add data as a head node of list
	 * 
	 * @param data
	 */
	public void push(Integer data) {
		LinkedListNode newNode = new LinkedListNode(data, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	/**
	 * Delete head node
	 * 
	 * @return
	 */
	public Integer pop() {
		if (head == null)
			return null;
		else {
			Integer data = head.data;
			LinkedListNode next = head.next;
			head.next = head = null;
			head = next;
			return data;
		}
	}

	/**
	 * Deleting the entire linked list
	 */
	public void deleteList() {
		LinkedListNode t = head;
		while (t != null) {
			LinkedListNode node = t;
			t = t.next;
			if (node != null) {
				node.next = null;
				node = null;
			}
		}
		head = null;
		size = 0;
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
