package com.my.ds;

import com.my.nodes.LinkNode;

// TODO : Define different function present in actual java LinkedList
public class LinkedList {
	private LinkNode start;
	private int size;

	// Adding a new item to this list
	public LinkedList add(int data) {
		if (this.getStart() == null) {
			this.setStart(new LinkNode(data));
		} else {
			LinkNode temp = this.getStart();
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(new LinkNode(data));
		}
		this.incrementSize();
		return this;
	}

	// Deleting a present key
	public LinkedList delete(int key) {
		LinkNode curr, prev;
		curr = prev = this.getStart();
		while (curr.getNext() != null && curr.getData() != key) {
			prev = curr;
			curr = curr.getNext();
		}
		// If the key is first element
		if (prev == curr) {
			this.setStart(curr.getNext());
		}
		if (curr != null && prev != curr && curr.getData() == key)
			prev.setNext(curr.getNext());

		this.decrementSize();
		return this;
	}

	// Printing the list
	public LinkedList printList() {
		LinkNode temp = this.getStart();
		if (this.getSize() > 0) {
			while (temp != null) {
				System.out.print(temp + (temp.getNext() != null ? "->" : "\n"));
				temp = temp.getNext();
			}
		} else {
			System.out.println("Empty LinkedList");
		}
		return this;
	}

	private void incrementSize() {
		this.setSize(this.getSize() + 1);
	}

	private void decrementSize() {
		if (size > 0)
			this.setSize(this.getSize() - 1);
	}

	public LinkNode getStart() {
		return start;
	}

	public void setStart(LinkNode start) {
		this.start = start;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
