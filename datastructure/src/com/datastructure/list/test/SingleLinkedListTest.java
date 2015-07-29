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
	}

	@Test
	public void testGetNth() {
		assertEquals("getNth?", null, list.getNth(1));
		list.add(8);
		list.add(32);
		list.add(89);
		assertEquals("getNth?", Integer.valueOf(32), list.getNth(1));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNthWithIndexOutOfBoundsException() {
		assertEquals("getNth?", null, list.getNth(-1));
	}

}
