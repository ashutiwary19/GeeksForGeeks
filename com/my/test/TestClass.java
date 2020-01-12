package com.my.test;

import com.my.ds.LinkedList;

public class TestClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1).add(2).printList().add(3).add(4).add(5).delete(1).delete(5).printList().delete(3).printList()
				.delete(1).delete(1).delete(2).printList().delete(4).printList();
	}
}
