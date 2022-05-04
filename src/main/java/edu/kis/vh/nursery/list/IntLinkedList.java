package edu.kis.vh.nursery.list;

/**
 * @author Student
 * class implementing a double linked list structure holding int type values
 */
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

	
	/**
	 * push - puts new value into the list
	 * @param i - value to be pushed into the list
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**isEmpty - checks if list is empty
	 * @return - returns true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**isFull - checks if list is full
	 * @return - returns false, because list is dynamicall expanding
	 */
	public boolean isFull() {
		return false;
	}

	/**top - returns last value from the list
	 * @return - int value of last element
	 */
	public int top() {
		if (isEmpty())
			return RETURN_CODE_ON_EMPTY_LIST;
		return last.value;
	}

	/**pop - same as top, but also removes the element from the list
	 * @return - int value of last element
	 */
	public int pop() {
		if (isEmpty())
			return RETURN_CODE_ON_EMPTY_LIST;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
