package cloud.groupb.ui;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import cloud.groupb.business.FileScore;
import cloud.groupb.business.Suggestion;
import cloud.groupb.enums.FileSystem;
import cloud.groupb.enums.Parameters;

/**
 * @author GroupB1
 *
 */
public class CloudFileSelection {

	private Map<Parameters, String> generalSelectionMap;
	private Map<Parameters, String> iOzoneSelectionMap;
//	private Map<Parameters, String> customSelectionMap;

	private String[] environment = { "." };

	public CloudFileSelection() {
		generalSelectionMap = new LinkedHashMap<Parameters, String>();
		iOzoneSelectionMap = new LinkedHashMap<Parameters, String>();
	}

	protected Shell shell;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CloudFileSelection window = new CloudFileSelection();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(~SWT.RESIZE);
		shell.setSize(788, 697);
		shell.setText("Cloud File System Selection");
		
		// General parameters with no time score
		Group grpGeneral = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpGeneral
				.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpGeneral.setToolTipText("General File System Requirements");
		grpGeneral.setText("General");
		grpGeneral.setBounds(0, 0, 754, 146);

		// File size
		Group grpFileSize = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpFileSize
				.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFileSize.setText("File Size");
		grpFileSize.setBounds(118, 29, 137, 52);

		Button btnFileSmall = new Button(grpFileSize, SWT.RADIO);
		btnFileSmall.setBounds(10, 22, 57, 20);
		btnFileSmall.setText("Small");
		btnFileSmall.setSelection(true);

		Button btnFileLarge = new Button(grpFileSize, SWT.RADIO);
		btnFileLarge.setBounds(73, 22, 57, 20);
		btnFileLarge.setText("Large");
		// File Size

		// Number of files
		Group grpNumberOfFiles = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpNumberOfFiles.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpNumberOfFiles.setText("Number of Files");
		grpNumberOfFiles.setBounds(261, 29, 149, 52);

		Button btnFileFew = new Button(grpNumberOfFiles, SWT.RADIO);
		btnFileFew.setBounds(10, 22, 55, 20);
		btnFileFew.setText("Few");
		btnFileFew.setSelection(true);

		Button btnFileMany = new Button(grpNumberOfFiles, SWT.RADIO);
		btnFileMany.setBounds(71, 22, 61, 20);
		btnFileMany.setText("Many");
		// Number of files

		// Scalability
		Group grpScalability = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpScalability.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpScalability.setText("Scalability");
		grpScalability.setBounds(416, 29, 252, 52);

		Button btnModeratelyScalable = new Button(grpScalability, SWT.RADIO);
		btnModeratelyScalable.setBounds(10, 22, 127, 20);
		btnModeratelyScalable.setText("Moderately Scalable");
		btnModeratelyScalable.setSelection(true);

		Button btnHighlyScalable = new Button(grpScalability, SWT.RADIO);
		btnHighlyScalable.setBounds(143, 22, 102, 20);
		btnHighlyScalable.setText("Highly Scalable");
		// Scalability

		// Random Access
		Group grpRandomaccess = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpRandomaccess.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpRandomaccess.setText("RandomAccess");
		grpRandomaccess.setBounds(118, 87, 137, 52);

		Button btnRandomYes = new Button(grpRandomaccess, SWT.RADIO);
		btnRandomYes.setBounds(10, 22, 38, 20);
		btnRandomYes.setText("Yes");
		btnRandomYes.setSelection(true);

		Button btnRandomNo = new Button(grpRandomaccess, SWT.RADIO);
		btnRandomNo.setBounds(68, 22, 49, 20);
		btnRandomNo.setText("No");
		// Redundant metadata server

		// Storage type
		Group grpStorageType = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpStorageType.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpStorageType.setText("Storage Type");
		grpStorageType.setBounds(443, 87, 225, 52);

		Button btnStorageBlock = new Button(grpStorageType, SWT.RADIO);
		btnStorageBlock.setText("Block storage");
		btnStorageBlock.setBounds(10, 19, 101, 30);
		btnStorageBlock.setSelection(true);

		Button btnStorageObject = new Button(grpStorageType, SWT.RADIO);
		btnStorageObject.setText("Object storage");
		btnStorageObject.setBounds(117, 19, 101, 30);
		// Random Access

		// Redundant metadata server
		Group grpRedundantMetadataServer = new Group(grpGeneral, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpRedundantMetadataServer.setBounds(261, 87, 176, 52);
		grpRedundantMetadataServer.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD));
		grpRedundantMetadataServer.setText("Redundant Metadata Server");

		Button btnMetaYes = new Button(grpRedundantMetadataServer, SWT.RADIO);
		btnMetaYes.setText("Yes");
		btnMetaYes.setBounds(10, 19, 44, 30);
		btnMetaYes.setSelection(true);

		Button btnMetaNo = new Button(grpRedundantMetadataServer, SWT.RADIO);
		btnMetaNo.setText("No");
		btnMetaNo.setBounds(90, 19, 66, 30);
		// Storage type
		// General parameters

		// IOzone parameters
		Group grpIozone = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpIozone.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpIozone.setText("IOzone");
		grpIozone.setBounds(0, 152, 754, 219);

		// Write
		Group grpWriteEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_OUT);
		grpWriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpWriteEfficiency.setText("Write Efficiency");
		grpWriteEfficiency.setBounds(117, 27, 276, 57);

		Button btnWriteModerate = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteModerate.setBounds(10, 24, 119, 20);
		btnWriteModerate.setText("Moderate");
		btnWriteModerate.setSelection(true);

		Button btnWriteHigh = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteHigh.setBounds(135, 24, 131, 20);
		btnWriteHigh.setText("High");
		// Re-Write

		// Read
		Group grpReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpReadEfficiency.setText("Read Efficiency");
		grpReadEfficiency.setBounds(399, 27, 267, 57);

		Button btnReadModerate = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadModerate.setText("Moderate");
		btnReadModerate.setBounds(10, 24, 111, 20);
		btnReadModerate.setSelection(true);

		Button btnReadHigh = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadHigh.setText("High");
		btnReadHigh.setBounds(135, 24, 111, 20);
		// Random Mix

		// Backward read
		Group grpBackwardReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpBackwardReadEfficiency.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD));
		grpBackwardReadEfficiency.setText("Backward Read");
		grpBackwardReadEfficiency.setBounds(117, 154, 276, 58);

		Button btnBackwardReadNotRequired = new Button(
				grpBackwardReadEfficiency, SWT.RADIO);
		btnBackwardReadNotRequired.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBackwardReadNotRequired.setText("Not Required");
		btnBackwardReadNotRequired.setBounds(135, 24, 131, 20);

		Button btnBackwardReadRequired = new Button(grpBackwardReadEfficiency,
				SWT.RADIO);
		btnBackwardReadRequired.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBackwardReadRequired.setText("Required");
		btnBackwardReadRequired.setSelection(true);
		btnBackwardReadRequired.setBounds(10, 24, 119, 20);
		// Record Re-write

		// Stride read
		Group grpStridedReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpStridedReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI",
				9, SWT.BOLD));
		grpStridedReadEfficiency.setText("Strided Read Efficiency");
		grpStridedReadEfficiency.setBounds(399, 154, 267, 58);

		Button btnStridedReadNotRequired = new Button(grpStridedReadEfficiency,
				SWT.RADIO);
		btnStridedReadNotRequired.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnStridedReadNotRequired.setText("Not Required");
		btnStridedReadNotRequired.setBounds(136, 24, 111, 20);

		Button btnStridedReadRequired = new Button(grpStridedReadEfficiency,
				SWT.RADIO);
		btnStridedReadRequired.setText("Required");
		btnStridedReadRequired.setSelection(true);
		btnStridedReadRequired.setBounds(10, 24, 111, 20);
		// FRe-Write

		// FWrite
		Group grpFwriteEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpFwriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpFwriteEfficiency.setText("Re-Write Efficiency");
		grpFwriteEfficiency.setBounds(117, 90, 276, 58);

		Button btnReWriteModerate = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnReWriteModerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnReWriteModerate.setText("Required");
		btnReWriteModerate.setBounds(10, 24, 119, 20);
		btnReWriteModerate.setSelection(true);

		Button btnReWriteHigh = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnReWriteHigh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnReWriteHigh.setText("Not Required");
		btnReWriteHigh.setBounds(135, 24, 131, 20);
		// FWrite

		// FRead
		Group grpFReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpFReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpFReadEfficiency.setText("Re-Read Efficiency");
		grpFReadEfficiency.setBounds(399, 90, 267, 58);

		Button btnReReadModerate = new Button(grpFReadEfficiency, SWT.RADIO);
		btnReReadModerate.setText("Moderate");
		btnReReadModerate.setBounds(10, 24, 111, 20);
		btnReReadModerate.setSelection(true);

		Button btnReReadHigh = new Button(grpFReadEfficiency, SWT.RADIO);
		btnReReadHigh.setText("High");
		btnReReadHigh.setBounds(135, 24, 111, 20);
		// FRe-Read
		// IOzone

		// Custom
		Group grpCustom = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpCustom.setEnabled(false);
		grpCustom.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpCustom.setText("Custom");
		grpCustom.setBounds(0, 377, 754, 100);
		// grpCustom.setSelection(false);

		// Lookup
		Group grpLookupTime = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpLookupTime.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpLookupTime.setText("Lookup Time");
		grpLookupTime.setBounds(117, 26, 147, 67);

		Button btnLookupLow = new Button(grpLookupTime, SWT.RADIO);
		btnLookupLow.setBounds(10, 35, 61, 20);
		btnLookupLow.setText("Low");
		btnLookupLow.setSelection(true);

		Button btnLookupHigh = new Button(grpLookupTime, SWT.RADIO);
		btnLookupHigh.setBounds(77, 35, 60, 20);
		btnLookupHigh.setText("High");
		// Lookup

		// Access Control
		Group grpAccessControlPerformance = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpAccessControlPerformance.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD));
		grpAccessControlPerformance.setText("Access Control Performance");
		grpAccessControlPerformance.setBounds(270, 26, 193, 67);

		Button btnAccessHigh = new Button(grpAccessControlPerformance,
				SWT.RADIO);
		btnAccessHigh.setBounds(10, 36, 67, 20);
		btnAccessHigh.setText("High");
		btnAccessHigh.setSelection(true);

		Button btnAccessModerate = new Button(grpAccessControlPerformance,
				SWT.RADIO);
		btnAccessModerate.setBounds(83, 36, 90, 20);
		btnAccessModerate.setText("Moderate");
		// Access Control

		// Metadata access
		Group grpMetadataAccess = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpMetadataAccess.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpMetadataAccess.setText("Metadta Access Performance");
		grpMetadataAccess.setBounds(469, 26, 195, 67);

		Button btnMetadataHigh = new Button(grpMetadataAccess, SWT.RADIO);
		btnMetadataHigh.setBounds(10, 37, 73, 20);
		btnMetadataHigh.setText("High");
		btnMetadataHigh.setSelection(true);

		Button btnMetadataModerate = new Button(grpMetadataAccess, SWT.RADIO);
		btnMetadataModerate.setBounds(89, 37, 86, 20);
		btnMetadataModerate.setText("Moderate");
		// Metadata access

		Group fileSystemGroup = new Group(shell, SWT.NONE);
		fileSystemGroup.setBounds(122, 519, 542, 126);

		Button btnStopHdfs = new Button(fileSystemGroup, SWT.NONE);
		btnStopHdfs.setEnabled(false);
		btnStopHdfs.setBounds(10, 98, 117, 25);
		btnStopHdfs.setText("STOP HDFS");
		
		Button btnStopSwift = new Button(fileSystemGroup, SWT.NONE);
		btnStopSwift.setEnabled(false);
		btnStopSwift.setText("STOP SWIFT");
		btnStopSwift.setBounds(217, 98, 117, 25);
		
		Button btnStopCeph = new Button(fileSystemGroup, SWT.NONE);
		btnStopCeph.setEnabled(false);
		btnStopCeph.setText("STOP CEPH");
		btnStopCeph.setBounds(415, 98, 117, 25);
		
		Button btnHdfs = new Button(fileSystemGroup, SWT.NONE);
		btnHdfs.setEnabled(false);
		btnHdfs.setText("HDFS");
		btnHdfs.setBounds(10, 22, 117, 70);
		Image hdfsImage = new Image(shell.getDisplay(), "hadoop.jpg");
		btnHdfs.setImage(hdfsImage);

		Button btnSwift = new Button(fileSystemGroup, SWT.NONE);
		btnSwift.setEnabled(false);
		btnSwift.setText("SWIFT");
		Image swiftImage = new Image(shell.getDisplay(), "swift.png");
		btnSwift.setImage(swiftImage);
		btnSwift.setBounds(217, 22, 117, 70);

		Button btnCeph = new Button(fileSystemGroup, SWT.NONE);
		btnCeph.setEnabled(false);
		btnCeph.setText("CEPH");
		Image cephImage = new Image(shell.getDisplay(), "ceph.png");
		btnCeph.setImage(cephImage);
		btnCeph.setBounds(415, 22, 117, 70);

		btnHdfs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "hdfsStart.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				btnStopHdfs.setEnabled(true);
				btnHdfs.setEnabled(false);
			}
		});

		btnSwift.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "swiftStart.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnCeph.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "cephStart.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnStopHdfs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "hdfsStop.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				btnStopHdfs.setEnabled(false);
				btnHdfs.setEnabled(true);
			}
		});

		btnStopSwift.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "swiftStop.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				btnStopSwift.setEnabled(false);
				btnSwift.setEnabled(true);
			}
		});
		
		btnStopCeph.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String command = "cephStop.sh";
				try {
					Runtime.getRuntime().exec(command, environment);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				btnStopCeph.setEnabled(false);
				btnCeph.setEnabled(true);
			}
		});
		
		Button btnSuggest = new Button(shell, SWT.NONE);
		btnSuggest.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnFileSmall.getSelection()) {
					generalSelectionMap.put(Parameters.FILE_SIZE,
							btnFileSmall.getText());
				} else {
					generalSelectionMap.put(Parameters.FILE_SIZE,
							btnFileLarge.getText());
				}

				if (btnFileFew.getSelection()) {
					generalSelectionMap.put(Parameters.NUMBER_OF_FILES,
							btnFileFew.getText());
				} else {
					generalSelectionMap.put(Parameters.NUMBER_OF_FILES,
							btnFileMany.getText());
				}

				if (btnModeratelyScalable.getSelection()) {
					generalSelectionMap.put(Parameters.SCALABILITY,
							btnModeratelyScalable.getText());
				} else {
					generalSelectionMap.put(Parameters.SCALABILITY,
							btnHighlyScalable.getText());
				}

				if (btnRandomYes.getSelection()) {
					generalSelectionMap.put(Parameters.RANDOM_ACCESS,
							btnRandomYes.getText());
				} else {
					generalSelectionMap.put(Parameters.RANDOM_ACCESS,
							btnRandomNo.getText());
				}

				if (btnMetaYes.getSelection()) {
					generalSelectionMap.put(Parameters.METADATA,
							btnMetaYes.getText());
				} else {
					generalSelectionMap.put(Parameters.METADATA,
							btnMetaNo.getText());
				}

				if (btnStorageBlock.getSelection()) {
					generalSelectionMap.put(Parameters.STORAGE_TYPE,
							btnStorageBlock.getText());
				} else {
					generalSelectionMap.put(Parameters.STORAGE_TYPE,
							btnStorageObject.getText());
				}

				if (btnWriteModerate.getSelection()) {
					iOzoneSelectionMap.put(Parameters.WRITE,
							btnWriteModerate.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.WRITE,
							btnWriteHigh.getText());
				}

				if (btnReadModerate.getSelection()) {
					iOzoneSelectionMap.put(Parameters.READ,
							btnReadModerate.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.READ,
							btnReadHigh.getText());
				}

				if (btnReWriteModerate.getSelection()) {
					iOzoneSelectionMap.put(Parameters.RE_WRITE,
							btnReWriteModerate.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.RE_WRITE,
							btnReWriteHigh.getText());
				}

				if (btnReReadModerate.getSelection()) {
					iOzoneSelectionMap.put(Parameters.RE_READ,
							btnReReadModerate.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.RE_READ,
							btnReReadHigh.getText());
				}

				if (btnBackwardReadRequired.getSelection()) {
					iOzoneSelectionMap.put(Parameters.BACKWARD_READ,
							btnBackwardReadRequired.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.BACKWARD_READ,
							btnBackwardReadNotRequired.getText());
				}

				if (btnStridedReadRequired.getSelection()) {
					iOzoneSelectionMap.put(Parameters.STRIDED_READ,
							btnStridedReadRequired.getText());
				} else {
					iOzoneSelectionMap.put(Parameters.STRIDED_READ,
							btnStridedReadNotRequired.getText());
				}

				Suggestion suggestion = new Suggestion();
				suggestion.getGeneralSuggestion(generalSelectionMap);

				FileScore iOzoneRecommendation = suggestion
						.getIOzoneSuggestion(iOzoneSelectionMap);

				if (iOzoneRecommendation.getFileSystem()
						.equals(FileSystem.HDFS)) {
					btnHdfs.setEnabled(true);
				} else if (iOzoneRecommendation.getFileSystem().equals(
						FileSystem.SWIFT)) {
					btnSwift.setEnabled(true);
				} else {
					btnCeph.setEnabled(true);
				}
				// MessageBox box = new MessageBox(shell, SWT.ICON_WORKING);
				// box.setText("Recommendation");
				// box.setMessage(recommendation);
				// box.open();
				// MessageDialog.open(MessageDialog.INFORMATION, shell,
				// "Reccomendation",
				// "Recommended File System ::" + recommendation, SWT.NONE);
			}
		});
		btnSuggest.setGrayed(true);
		btnSuggest.setToolTipText("Suggest a file system");
		btnSuggest.setBounds(220, 483, 331, 30);
		btnSuggest.setText("SUGGEST");

	}
}
