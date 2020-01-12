package com.my.nodes;

//This node is used mainly for linked list and its operations
public class LinkNode {
	// TODO : Make it generic and not only for integer
	private int data;
	private LinkNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}

	public LinkNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public LinkNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}
