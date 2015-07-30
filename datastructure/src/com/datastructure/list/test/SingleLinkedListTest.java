package com.datastructure.list.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.datastructure.list.SingleLinkedList;

public class SingleLinkedListTest {

	private SingleLinkedList list;

	@Before
	public void setUp() throws Exception {
		list = new SingleLinkedList();
	}

	@Test
	public void testListNotNull() {
		assertNotNull(list);
	}

	@Test
	public void testAdd() {
		list.add(3);
		list.add(8);
		list.add(38);
		assertEquals("size?", 3, list.count());
	}

	@Test
	public void testDeleteList() {
		SingleLinkedList list = new SingleLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		assertEquals("size?", 4, list.count());
		list.deleteList();
		assertEquals("size?", 0, list.count());
		list.add(5);
		list.add(8);
		assertEquals("size?", 2, list.count());
	}

	@Test
	public void testGetNth() {
		assertEquals("getNth?", null, list.getNth(1));
		list.add(8);
		list.add(32);
		list.add(89);
		assertEquals("getNth?", Integer.valueOf(32), list.getNth(1));
	}

	@Test
	public void testAddFirst() {
		list.add(8);
		list.add(9);
		assertEquals("getNth?", Integer.valueOf(8), list.getNth(0));
		list.push(7);
		assertEquals("getNth?", Integer.valueOf(7), list.getNth(0));
	}

	@Test
	public void testAddAtHead() {
		list.addAt(8, 0);
	}

	@Test
	public void testAddAtMiddle() {

	}

	@Test
	public void testAddAtTail() {

	}

	@Test
	public void testStackKindOfOperation() {
		// push data to list LIFO fashion
		list.push(4);
		list.push(5);
		list.push(6);
		// data to compare
		int top = list.getNth(0);
		// pop data from list LIFO fashion
		int element = list.pop();
		assertEquals("equals?", top, element);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNthWithIndexOutOfBoundsException() {
		assertEquals("getNth?", null, list.getNth(-1));
	}

}
