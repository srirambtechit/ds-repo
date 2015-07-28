package com.datastructure.list;

public class LinkedListNode {
	public Integer data;
	public LinkedListNode next;

	public LinkedListNode(Integer data, LinkedListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public String toString() {
		if (next == null)
			return data.toString();
		return data + " " + next.toString();
	}

}
