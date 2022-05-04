package edu.kis.vh.nursery.list;

public class IntLinkedList {
	
	private class Node{
		public final int value;
		public Node prev, next;


		protected Node(int i) {
			value = i;
		}
	}


	private static final int RETURN_CODE_ON_EMPTY_LIST = -1;
	

	private Node last;
	private int i;


	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURN_CODE_ON_EMPTY_LIST;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return RETURN_CODE_ON_EMPTY_LIST;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

}
