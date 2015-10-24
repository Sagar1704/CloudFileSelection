package cloud.groupb.data;

import java.util.HashMap;
import java.util.TreeSet;

import cloud.groupb.business.FileScore;
import cloud.groupb.comparator.ScoreComparator;
import cloud.groupb.enums.Parameters;
import cloud.groupb.enums.Score;

public class Data {
	private HashMap<Parameters, TreeSet<FileScore>> dataMap;

	public void createIOzoneData() {
		FileScore hdfs = new FileScore();
		FileScore swift = new FileScore();
		FileScore ceph = new FileScore();
		TreeSet<FileScore> fileScores;

		// Write
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.WRITE, fileScores);

		// Re-Write
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RE_WRITE, fileScores);

		// Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.READ, fileScores);

		// Re-Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RE_READ, fileScores);

		// Random Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RANDOM_READ, fileScores);

		// Random Write
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RANDOM_WRITE, fileScores);

		// Random Mix
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RANDOM_MIX, fileScores);

		// Backward Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.BACKWARD_READ, fileScores);

		// Record Re-Write
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.RECORD_RE_WRITE, fileScores);

		// Strided Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.STRIDED_READ, fileScores);

		// FWrite
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.F_WRITE, fileScores);

		// FRe-Write
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.F_RE_WRITE, fileScores);

		// FRead
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.F_READ, fileScores);

		// FRe-Read
		hdfs.setScore(Score.HIGH.getScore());
		fileScores = new TreeSet<FileScore>(new ScoreComparator());
		fileScores.add(hdfs);
		swift.setScore(Score.MODERATE.getScore());
		fileScores.add(swift);
		ceph.setScore(Score.HIGH.getScore());
		fileScores.add(ceph);
		dataMap.put(Parameters.F_RE_READ, fileScores);
	}
}
