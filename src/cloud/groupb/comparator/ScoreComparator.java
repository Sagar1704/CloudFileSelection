package cloud.groupb.comparator;

import java.util.Comparator;

import cloud.groupb.business.FileScore;

public class ScoreComparator implements Comparator<FileScore> {

	@Override
	public int compare(FileScore o1, FileScore o2) {
		if (o1.getScore() < o2.getScore())
			return 1;
		else
			return -1;
	}

}
