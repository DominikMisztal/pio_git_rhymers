package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MAX_NUMBER_OF_TOTAL_COUNTS = 11;
	private static final int STARTING_NUMBER_OF_TOTAL_COUNTS = -1;
	private static final int NUMBER_OF_NUMBERS = 12;

	private int[] numbers = new int[NUMBER_OF_NUMBERS];

	public int total = STARTING_NUMBER_OF_TOTAL_COUNTS;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STARTING_NUMBER_OF_TOTAL_COUNTS;
	}

	public boolean isFull() {
		return total == MAX_NUMBER_OF_TOTAL_COUNTS;
	}

	protected int peekaboo() {
		if (callCheck())
			return STARTING_NUMBER_OF_TOTAL_COUNTS;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STARTING_NUMBER_OF_TOTAL_COUNTS;
		return numbers[total--];
	}
//	Ostatnio edytowany plik wedlug alt + →

}
