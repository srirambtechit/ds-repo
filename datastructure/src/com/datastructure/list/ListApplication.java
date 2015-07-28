package com.datastructure.list;

public class ListApplication {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.add(3);
		list.add(8);
		System.out.println(list);
		System.out.println(list.count());
	}

}
