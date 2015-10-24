package cloud.groupb.enums;

public enum Score {
	ABSENT(0),
	LOW(1),
	MODERATE(2),
	HIGH(3);
	
	private int score;

	private Score(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	
}
