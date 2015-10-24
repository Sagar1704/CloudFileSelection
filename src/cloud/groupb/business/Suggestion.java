package cloud.groupb.business;

import java.util.Map;
import java.util.TreeSet;

import cloud.groupb.comparator.ScoreComparator;
import cloud.groupb.enums.FileSystem;
import cloud.groupb.enums.Parameters;
import cloud.groupb.enums.Score;

public class Suggestion {
	private TreeSet<FileScore> fileSystems;

	public Suggestion() {
		super();
		this.fileSystems = new TreeSet<FileScore>(new ScoreComparator());
	}

	public FileSystem getGeneralSuggestion(Map<Parameters, String> selectionMap) {
		FileScore hdfs = new FileScore(FileSystem.HDFS);
		FileScore swift = new FileScore(FileSystem.SWIFT);
		FileScore ceph = new FileScore(FileSystem.CEPH);

		for (Parameters parameter : selectionMap.keySet()) {
			if (parameter.equals(Parameters.FILE_SIZE)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("small")) {
					swift.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("large")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					hdfs.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			} else if (parameter.equals(Parameters.NUMBER_OF_FILES)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("few")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					hdfs.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("many")) {
					hdfs.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			} else if (parameter.equals(Parameters.SCALABILITY)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("moderately scalable")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					hdfs.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("highly scalable")) {
					hdfs.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			} else if (parameter.equals(Parameters.RANDOM_ACCESS)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("yes")) {
					hdfs.setScore(Score.ABSENT.getScore());
					swift.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("no")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			} else if (parameter.equals(Parameters.METADATA)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("yes")) {
					hdfs.setScore(Score.ABSENT.getScore());
					swift.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("no")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			}  else if (parameter.equals(Parameters.STORAGE_TYPE)) {
				if (selectionMap.get(parameter).equalsIgnoreCase("block storage")) {
					hdfs.incrementScore();
					hdfs.incrementScore();
					hdfs.incrementScore();
					swift.setScore(Score.ABSENT.getScore());
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				} else if (selectionMap.get(parameter).equalsIgnoreCase("object storage")) {
					hdfs.setScore(Score.ABSENT.getScore());
					swift.incrementScore();
					swift.incrementScore();
					swift.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
					ceph.incrementScore();
				}
			}
		}

		fileSystems.add(hdfs);
		fileSystems.add(swift);
		fileSystems.add(ceph);

		return fileSystems.first().getFileSystem();
	}
}
