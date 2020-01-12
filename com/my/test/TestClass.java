package com.my.test;

import com.my.ds.LinkedList;

public class TestClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1).add(2).add(3).add(4).add(5).printList().reverseList().printList();
	}
}
