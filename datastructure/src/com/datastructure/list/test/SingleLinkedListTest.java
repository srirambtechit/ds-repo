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

	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAtWhenListEmpty_fail() {
		list.addAt(8, 1);
		print("testAddAtWhenListEmpty_fail", list);
	}

	@Test
	public void testAddAtWhenListEmpty_pass() {
		list.addAt(8, 0);
		list.addAt(10, 0);
		print("testAddAtWhenListEmpty_pass", list);
	}

	@Test
	public void testAddAtHead_pass() {
		list.add(9);
		list.addAt(8, 0);
		print("testAddAtHead_pass", list);
	}

	@Test
	public void testAddAtTail_pass() {
		list.add(9); // index 0
		list.add(10); // index 1
		list.addAt(8, 1);
		print("testAddAtTail_pass", list);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAtHead_fail() {
		print("testAddAtHead_fail", list);
		list.addAt(8, -1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAtMiddle_fail() {
		print("testAddAtMiddle_fail", list);
		list.addAt(3, -1);
	}

	@Test
	public void testAddAtMiddle_pass() {
		list.add(3); // [3]
		list.add(2); // [3, 2]
		list.addAt(12, 1); // add 12 after 3, so [3, 12, 2]
		list.addAt(10, 2); // add 10 after 12, so [3, 12, 10, 2]
		list.addAt(100, 3);
		print("testAddAtMiddle_pass", list);
	}

	@Test
	public void testSortedInsert_pass_case1() {
		list.sortedInsert(4);
		print("testSortedInsert_pass_case1 : list is empty", list);
	}

	@Test
	public void testSortedInsert_pass_case2() {
		list.sortedInsert(5);
		list.sortedInsert(3);
		print("testSortedInsert_pass_case2: head.data is greater than input data",
				list);
	}

	@Test
	public void testSortedInsert_pass_case3() {
		list.sortedInsert(5);
		list.sortedInsert(6);
		list.sortedInsert(9);
		list.sortedInsert(8);
		print("testSortedInsert_pass_case3: insert at middle", list);
	}

	@Test
	public void testSortedInsert_pass_case4() {
		list.sortedInsert(5);
		list.sortedInsert(6);
		list.sortedInsert(7);
		list.sortedInsert(8);
		print("testSortedInsert_pass_case4: insert at last node", list);
	}

	@Test
	public void testSortedInsert_pass() {
		list.sortedInsert(5);
		list.sortedInsert(8);
		list.sortedInsert(3);
		list.sortedInsert(4);
		list.sortedInsert(7);
		list.sortedInsert(10);
		list.sortedInsert(6);
		list.sortedInsert(1);
		print("testSortedInsert_pass", list);
	}

	private void print(String method, Object obj) {
		System.out.printf("%s : %s%n", method, obj);
	}

}
