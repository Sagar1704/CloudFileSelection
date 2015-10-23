package cloud.groupb.enums;

/**
 * @author GroupB1
 *
 */
public enum FileSystem {
	HDFS("HDFS"),
	SWIFT("Swift"),
	CEPH("Ceph");
	
	private final String FILE_SYSTEM;
	private FileSystem(String FILE) {
		this.FILE_SYSTEM = FILE;
	}
	
	public String getFileSytem() {
		return FILE_SYSTEM;
	}
}
