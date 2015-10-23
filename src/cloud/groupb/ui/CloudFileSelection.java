package cloud.groupb.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @author GroupB1
 *
 */
public class CloudFileSelection {

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
		shell = new Shell();
		shell.setSize(1200, 780);
		shell.setText("Cloud File System Selection");

		// General parameters with no time score
		Group grpGeneral = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpGeneral.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpGeneral.setToolTipText("General File System Requirements");
		grpGeneral.setText("General");
		grpGeneral.setBounds(0, 0, 1172, 185);

		// File size
		Group grpFileSize = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFileSize.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFileSize.setText("File Size");
		grpFileSize.setBounds(10, 34, 376, 52);

		Button btnFileTiny = new Button(grpFileSize, SWT.RADIO);
		btnFileTiny.setBounds(10, 22, 111, 20);
		btnFileTiny.setText("Tiny");
		btnFileTiny.setEnabled(true);

		Button btnFileMedium = new Button(grpFileSize, SWT.RADIO);
		btnFileMedium.setBounds(127, 22, 111, 20);
		btnFileMedium.setText("Medium");

		Button btnFileLarge = new Button(grpFileSize, SWT.RADIO);
		btnFileLarge.setBounds(244, 22, 111, 20);
		btnFileLarge.setText("Large");
		// File Size

		// Number of files
		Group grpNumberOfFiles = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpNumberOfFiles.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpNumberOfFiles.setText("Number of Files");
		grpNumberOfFiles.setBounds(392, 34, 315, 52);

		Button btnFileFew = new Button(grpNumberOfFiles, SWT.RADIO);
		btnFileFew.setBounds(10, 22, 156, 20);
		btnFileFew.setText("Few");
		btnFileFew.setEnabled(true);

		Button btnFileMany = new Button(grpNumberOfFiles, SWT.RADIO);
		btnFileMany.setBounds(172, 22, 133, 20);
		btnFileMany.setText("Many");
		// Number of files

		// Scalability
		Group grpScalability = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpScalability.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpScalability.setText("Scalability");
		grpScalability.setBounds(713, 34, 449, 52);

		Button btnNotScalable = new Button(grpScalability, SWT.RADIO);
		btnNotScalable.setBounds(10, 22, 199, 20);
		btnNotScalable.setText("Not Scalable");
		btnNotScalable.setEnabled(true);

		Button btnHighlyScalable = new Button(grpScalability, SWT.RADIO);
		btnHighlyScalable.setBounds(215, 22, 224, 20);
		btnHighlyScalable.setText("Highly Scalable");
		// Scalability

		// Random Access
		Group grpRandomaccess = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRandomaccess.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRandomaccess.setText("RandomAccess");
		grpRandomaccess.setBounds(10, 110, 376, 52);

		Button btnRandomYes = new Button(grpRandomaccess, SWT.RADIO);
		btnRandomYes.setBounds(10, 22, 64, 20);
		btnRandomYes.setText("Yes");
		btnRandomYes.setEnabled(true);

		Button btnRandomNo = new Button(grpRandomaccess, SWT.RADIO);
		btnRandomNo.setBounds(80, 22, 64, 20);
		btnRandomNo.setText("No");
		// Random Access

		// Multi-tenancy
		Group grpMultitenancy = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpMultitenancy.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpMultitenancy.setText("Multi-Tenancy");
		grpMultitenancy.setBounds(713, 110, 449, 52);

		Button btnMultiYes = new Button(grpMultitenancy, SWT.RADIO);
		btnMultiYes.setBounds(10, 24, 60, 20);
		btnMultiYes.setText("Yes");
		btnMultiYes.setEnabled(true);

		Button btnMultiNo = new Button(grpMultitenancy, SWT.RADIO);
		btnMultiNo.setBounds(76, 24, 66, 20);
		btnMultiNo.setText("No");
		// Multi-tenancy

		// Redundant metadata server
		Group grpRedundantMetadataServer = new Group(grpGeneral, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRedundantMetadataServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRedundantMetadataServer.setText("Redundant Metadata Server");
		grpRedundantMetadataServer.setBounds(392, 110, 315, 52);

		Button btnMetaYes = new Button(grpRedundantMetadataServer, SWT.RADIO);
		btnMetaYes.setText("Yes");
		btnMetaYes.setBounds(10, 19, 60, 30);
		btnMetaYes.setEnabled(true);

		Button btnMetaNo = new Button(grpRedundantMetadataServer, SWT.RADIO);
		btnMetaNo.setText("No");
		btnMetaNo.setBounds(76, 19, 66, 30);
		// Redundant metadata server
		// General parameters

		// IOzone parameters
		Group grpIozone = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpIozone.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpIozone.setText("IOzone");
		grpIozone.setBounds(0, 203, 1172, 283);

		// Write
		Group grpWriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_OUT);
		grpWriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpWriteEfficiency.setText("Write Efficiency");
		grpWriteEfficiency.setBounds(10, 27, 252, 57);

		Button btnWriteModerate = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteModerate.setBounds(10, 24, 111, 20);
		btnWriteModerate.setText("Moderate");
		btnWriteModerate.setEnabled(true);

		Button btnWriteHigh = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteHigh.setBounds(168, 24, 74, 20);
		btnWriteHigh.setText("High");
		// Write

		// Re-Write
		Group grpRewriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRewriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRewriteEfficiency.setText("Re-Write Efficiency");
		grpRewriteEfficiency.setBounds(268, 27, 219, 57);

		Button btnReWriteModerate = new Button(grpRewriteEfficiency, SWT.RADIO);
		btnReWriteModerate.setText("Moderate");
		btnReWriteModerate.setBounds(10, 24, 111, 20);
		btnReWriteModerate.setEnabled(true);

		Button btnReWriteHigh = new Button(grpRewriteEfficiency, SWT.RADIO);
		btnReWriteHigh.setText("High");
		btnReWriteHigh.setBounds(135, 24, 74, 20);
		// Re-Write

		// Read
		Group grpReadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpReadEfficiency.setText("Read Efficiency");
		grpReadEfficiency.setBounds(493, 27, 219, 57);

		Button btnReadModerate = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadModerate.setText("Moderate");
		btnReadModerate.setBounds(10, 24, 111, 20);
		btnReadModerate.setEnabled(true);

		Button btnReadHigh = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadHigh.setText("High");
		btnReadHigh.setBounds(135, 24, 74, 20);
		// Read

		// Re-Read
		Group grpRereadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRereadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRereadEfficiency.setText("Re-Read Efficiency");
		grpRereadEfficiency.setBounds(718, 27, 219, 57);

		Button btnReReadModerate = new Button(grpRereadEfficiency, SWT.RADIO);
		btnReReadModerate.setText("Moderate");
		btnReReadModerate.setBounds(10, 24, 111, 20);
		btnReReadModerate.setEnabled(true);

		Button btnReReadHigh = new Button(grpRereadEfficiency, SWT.RADIO);
		btnReReadHigh.setText("High");
		btnReReadHigh.setBounds(135, 24, 74, 20);
		// Re-Read

		// Random Read
		Group grpRandomReadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRandomReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRandomReadEfficiency.setText("Random Read Efficiency");
		grpRandomReadEfficiency.setBounds(943, 27, 219, 57);

		Button btnRandomReadModerate = new Button(grpRandomReadEfficiency, SWT.RADIO);
		btnRandomReadModerate.setText("Moderate");
		btnRandomReadModerate.setBounds(10, 27, 111, 20);
		btnRandomReadModerate.setEnabled(true);

		Button btnRandomReadHigh = new Button(grpRandomReadEfficiency, SWT.RADIO);
		btnRandomReadHigh.setText("High");
		btnRandomReadHigh.setBounds(135, 27, 74, 20);
		// Random Read

		// Random Write
		Group grpRandomWriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRandomWriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRandomWriteEfficiency.setText("Random Write Efficiency");
		grpRandomWriteEfficiency.setBounds(10, 119, 252, 58);

		Button btnRandomWriteModerate = new Button(grpRandomWriteEfficiency, SWT.RADIO);
		btnRandomWriteModerate.setText("Moderate");
		btnRandomWriteModerate.setBounds(10, 24, 111, 20);
		btnRandomWriteModerate.setEnabled(true);

		Button btnRandomWriteHigh = new Button(grpRandomWriteEfficiency, SWT.RADIO);
		btnRandomWriteHigh.setText("High");
		btnRandomWriteHigh.setBounds(168, 24, 74, 20);
		// Random Write

		// Random Mix
		Group grpRandomMixEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRandomMixEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRandomMixEfficiency.setText("Random Mix Efficiency");
		grpRandomMixEfficiency.setBounds(268, 119, 219, 58);

		Button btnRandomMixModerate = new Button(grpRandomMixEfficiency, SWT.RADIO);
		btnRandomMixModerate.setText("Moderate");
		btnRandomMixModerate.setBounds(10, 24, 111, 20);
		btnRandomMixModerate.setEnabled(true);

		Button btnRandomMixHigh = new Button(grpRandomMixEfficiency, SWT.RADIO);
		btnRandomMixHigh.setText("High");
		btnRandomMixHigh.setBounds(135, 24, 74, 20);
		// Random Mix

		// Backward read
		Group grpBackwardReadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpBackwardReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpBackwardReadEfficiency.setText("Backward Read Efficiency");
		grpBackwardReadEfficiency.setBounds(493, 119, 219, 58);

		Button btnBackwardReadModerate = new Button(grpBackwardReadEfficiency, SWT.RADIO);
		btnBackwardReadModerate.setText("Moderate");
		btnBackwardReadModerate.setBounds(10, 24, 111, 20);
		btnBackwardReadModerate.setEnabled(true);

		Button btnBackwardReadHigh = new Button(grpBackwardReadEfficiency, SWT.RADIO);
		btnBackwardReadHigh.setText("High");
		btnBackwardReadHigh.setBounds(135, 24, 74, 20);
		// Backward read

		// Record Re-write
		Group grpRecordRewriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpRecordRewriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpRecordRewriteEfficiency.setText("Record Re-Write Efficiency");
		grpRecordRewriteEfficiency.setBounds(718, 119, 219, 58);

		Button btnRecordModerate = new Button(grpRecordRewriteEfficiency, SWT.RADIO);
		btnRecordModerate.setText("Moderate");
		btnRecordModerate.setBounds(10, 24, 111, 20);
		btnRecordModerate.setEnabled(true);

		Button btnRecordHigh = new Button(grpRecordRewriteEfficiency, SWT.RADIO);
		btnRecordHigh.setText("High");
		btnRecordHigh.setBounds(135, 24, 74, 20);
		// Record Re-write

		// Stride read
		Group grpStridedReadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpStridedReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpStridedReadEfficiency.setText("Strided Read Efficiency");
		grpStridedReadEfficiency.setBounds(943, 119, 219, 58);

		Button btnStrideModerate = new Button(grpStridedReadEfficiency, SWT.RADIO);
		btnStrideModerate.setText("Moderate");
		btnStrideModerate.setBounds(10, 24, 111, 20);
		btnStrideModerate.setEnabled(true);

		Button btnStrideHigh = new Button(grpStridedReadEfficiency, SWT.RADIO);
		btnStrideHigh.setText("High");
		btnStrideHigh.setBounds(135, 24, 74, 20);
		// Stride read

		// FRe-Write
		Group grpFrewriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFrewriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFrewriteEfficiency.setText("FRe-Write Efficiency");
		grpFrewriteEfficiency.setBounds(317, 202, 275, 58);

		Button btnFReWriteModerate = new Button(grpFrewriteEfficiency, SWT.RADIO);
		btnFReWriteModerate.setText("Moderate");
		btnFReWriteModerate.setBounds(10, 24, 111, 20);
		btnFReWriteModerate.setEnabled(true);

		Button btnFReWriteHigh = new Button(grpFrewriteEfficiency, SWT.RADIO);
		btnFReWriteHigh.setText("High");
		btnFReWriteHigh.setBounds(135, 24, 74, 20);
		// FRe-Write

		// FWrite
		Group grpFwriteEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFwriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFwriteEfficiency.setText("FWrite Efficiency");
		grpFwriteEfficiency.setBounds(10, 202, 301, 58);

		Button btnFWriteModerate = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnFWriteModerate.setText("Moderate");
		btnFWriteModerate.setBounds(10, 24, 111, 20);
		btnFWriteModerate.setEnabled(true);

		Button btnFWriteHigh = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnFWriteHigh.setText("High");
		btnFWriteHigh.setBounds(168, 24, 74, 20);
		// FWrite

		// FRead
		Group grpFReadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFReadEfficiency.setText("Fead Efficiency");
		grpFReadEfficiency.setBounds(598, 202, 275, 58);

		Button btnFReadModerate = new Button(grpFReadEfficiency, SWT.RADIO);
		btnFReadModerate.setText("Moderate");
		btnFReadModerate.setBounds(10, 24, 111, 20);
		btnFReadModerate.setEnabled(true);

		Button btnFReadHigh = new Button(grpFReadEfficiency, SWT.RADIO);
		btnFReadHigh.setText("High");
		btnFReadHigh.setBounds(135, 24, 74, 20);
		// FRead

		// FRE-Read
		Group grpFrereadEfficiency = new Group(grpIozone, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFrereadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFrereadEfficiency.setText("FRe-Read Efficiency");
		grpFrereadEfficiency.setBounds(879, 202, 283, 58);

		Button btnFReReadModerate = new Button(grpFrereadEfficiency, SWT.RADIO);
		btnFReReadModerate.setText("Moderate");
		btnFReReadModerate.setBounds(10, 24, 111, 20);
		btnFReReadModerate.setEnabled(true);

		Button btnFReReadHigh = new Button(grpFrereadEfficiency, SWT.RADIO);
		btnFReReadHigh.setText("High");
		btnFReReadHigh.setBounds(135, 24, 74, 20);
		// FRe-Read
		// IOzone

		// Custom
		Group grpCustom = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpCustom.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpCustom.setText("Custom");
		grpCustom.setBounds(0, 506, 1172, 149);

		// Lookup
		Group grpLookupTime = new Group(grpCustom, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpLookupTime.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpLookupTime.setText("Lookup Time");
		grpLookupTime.setBounds(10, 26, 347, 87);

		Button btnLookupLow = new Button(grpLookupTime, SWT.RADIO);
		btnLookupLow.setBounds(10, 41, 111, 20);
		btnLookupLow.setText("Low");
		btnLookupLow.setEnabled(true);

		Button btnLookupHigh = new Button(grpLookupTime, SWT.RADIO);
		btnLookupHigh.setBounds(181, 41, 111, 20);
		btnLookupHigh.setText("High");
		// Lookup

		// Concurrency
		Group grpConcurrencyPerformance = new Group(grpCustom, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpConcurrencyPerformance.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpConcurrencyPerformance.setText("Concurrency Performance");
		grpConcurrencyPerformance.setBounds(363, 26, 347, 88);

		Button btnConcurrencyHigh = new Button(grpConcurrencyPerformance, SWT.RADIO);
		btnConcurrencyHigh.setBounds(10, 40, 111, 20);
		btnConcurrencyHigh.setText("High");
		btnConcurrencyHigh.setEnabled(true);

		Button btnConcurrencyModerate = new Button(grpConcurrencyPerformance, SWT.RADIO);
		btnConcurrencyModerate.setBounds(204, 40, 111, 20);
		btnConcurrencyModerate.setText("Moderate");
		// Concurrency

		// Resilience
		Group grpFaultResilience = new Group(grpCustom, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpFaultResilience.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpFaultResilience.setText("Fault Resilience");
		grpFaultResilience.setBounds(716, 26, 442, 88);

		Button btnResilienceHigh = new Button(grpFaultResilience, SWT.RADIO);
		btnResilienceHigh.setBounds(10, 43, 111, 20);
		btnResilienceHigh.setText("High");
		btnResilienceHigh.setEnabled(true);

		Button btnResilienceModerate = new Button(grpFaultResilience, SWT.RADIO);
		btnResilienceModerate.setBounds(220, 43, 111, 20);
		btnResilienceModerate.setText("Moderate");
		// Resilience

		Button btnSuggest = new Button(shell, SWT.NONE);
		btnSuggest.setGrayed(true);
		btnSuggest.setToolTipText("Suggest a file system");
		btnSuggest.setBounds(374, 681, 331, 30);
		btnSuggest.setText("SUGGEST");

	}
}
