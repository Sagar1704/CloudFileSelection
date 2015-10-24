package cloud.groupb.business;

import cloud.groupb.enums.FileSystem;
import cloud.groupb.enums.Score;

public class FileScore {
	private FileSystem fileSystem;
	private int score;

	public FileScore() {
		this.setScore(Score.ABSENT.getScore());
	}
	
	public FileScore(FileSystem fileSystem) {
		super();
		this.fileSystem = fileSystem;
		this.setScore(Score.ABSENT.getScore());
	}


	public FileSystem getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void incrementScore() {
		score++;
	}

}
