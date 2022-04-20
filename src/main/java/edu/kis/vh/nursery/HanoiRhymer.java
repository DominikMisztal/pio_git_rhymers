package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int STARTING_NUMBER_OF_TOTAL_REJECTED = 0;
	
	int totalRejected = STARTING_NUMBER_OF_TOTAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	
}
