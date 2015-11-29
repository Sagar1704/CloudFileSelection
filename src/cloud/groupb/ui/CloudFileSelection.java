package cloud.groupb.ui;

import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import cloud.groupb.business.Suggestion;
import cloud.groupb.enums.Parameters;

/**
 * @author GroupB1
 *
 */
public class CloudFileSelection {

	private Map<Parameters, String> selectionMap;

	public CloudFileSelection() {
		selectionMap = new LinkedHashMap<Parameters, String>();
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
		shell = new Shell();
		shell.setSize(798, 742);
		shell.setText("Cloud File System Selection");

		// General parameters with no time score
		Group grpGeneral = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpGeneral
				.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpGeneral.setToolTipText("General File System Requirements");
		grpGeneral.setText("General");
		grpGeneral.setBounds(0, 0, 754, 185);

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
		grpRandomaccess.setBounds(118, 105, 137, 52);

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
		grpStorageType.setBounds(443, 105, 225, 52);

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
		grpRedundantMetadataServer.setBounds(261, 105, 176, 52);
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
		grpIozone.setBounds(0, 203, 754, 236);

		// Write
		Group grpWriteEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_OUT);
		grpWriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpWriteEfficiency.setText("Write Efficiency");
		grpWriteEfficiency.setBounds(99, 27, 294, 57);

		Button btnWriteModerate = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteModerate.setBounds(10, 24, 152, 20);
		btnWriteModerate.setText("Moderate");
		btnWriteModerate.setSelection(true);

		Button btnWriteHigh = new Button(grpWriteEfficiency, SWT.RADIO);
		btnWriteHigh.setBounds(168, 24, 106, 20);
		btnWriteHigh.setText("High");
		// Re-Write

		// Read
		Group grpReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpReadEfficiency.setText("Read Efficiency");
		grpReadEfficiency.setBounds(399, 27, 294, 57);

		Button btnReadModerate = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadModerate.setText("Moderate");
		btnReadModerate.setBounds(10, 24, 111, 20);
		btnReadModerate.setSelection(true);

		Button btnReadHigh = new Button(grpReadEfficiency, SWT.RADIO);
		btnReadHigh.setText("High");
		btnReadHigh.setBounds(135, 24, 139, 20);
		// Random Mix

		// Backward read
		Group grpBackwardReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpBackwardReadEfficiency.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD));
		grpBackwardReadEfficiency.setText("Backward Read");
		grpBackwardReadEfficiency.setBounds(99, 90, 294, 58);

		Button btnBackwardReadModerate = new Button(grpBackwardReadEfficiency,
				SWT.RADIO);
		btnBackwardReadModerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBackwardReadModerate.setText("Supported");
		btnBackwardReadModerate.setBounds(106, 24, 76, 20);

		Button btnBackwardReadHigh = new Button(grpBackwardReadEfficiency,
				SWT.RADIO);
		btnBackwardReadHigh.setText("Not Supported");
		btnBackwardReadHigh.setBounds(188, 24, 96, 20);

		Button button = new Button(grpBackwardReadEfficiency, SWT.RADIO);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setText("Not Required");
		button.setSelection(true);
		button.setBounds(5, 24, 95, 20);
		// Record Re-write

		// Stride read
		Group grpStridedReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpStridedReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI",
				9, SWT.BOLD));
		grpStridedReadEfficiency.setText("Strided Read Efficiency");
		grpStridedReadEfficiency.setBounds(399, 90, 294, 58);

		Button btnStrideModerate = new Button(grpStridedReadEfficiency,
				SWT.RADIO);
		btnStrideModerate.setText("Moderate");
		btnStrideModerate.setBounds(129, 24, 102, 20);

		Button btnStrideHigh = new Button(grpStridedReadEfficiency, SWT.RADIO);
		btnStrideHigh.setText("High");
		btnStrideHigh.setBounds(237, 24, 47, 20);

		Button btnNotRequired = new Button(grpStridedReadEfficiency, SWT.RADIO);
		btnNotRequired.setText("Not Required");
		btnNotRequired.setSelection(true);
		btnNotRequired.setBounds(10, 24, 113, 20);
		// FRe-Write

		// FWrite
		Group grpFwriteEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpFwriteEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpFwriteEfficiency.setText("FWrite Efficiency");
		grpFwriteEfficiency.setBounds(99, 154, 294, 58);

		Button btnFWriteModerate = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnFWriteModerate.setText("Moderate");
		btnFWriteModerate.setBounds(10, 24, 111, 20);
		btnFWriteModerate.setSelection(true);

		Button btnFWriteHigh = new Button(grpFwriteEfficiency, SWT.RADIO);
		btnFWriteHigh.setText("High");
		btnFWriteHigh.setBounds(168, 24, 106, 20);
		// FWrite

		// FRead
		Group grpFReadEfficiency = new Group(grpIozone, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpFReadEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpFReadEfficiency.setText("Fead Efficiency");
		grpFReadEfficiency.setBounds(399, 154, 294, 58);

		Button btnFReadModerate = new Button(grpFReadEfficiency, SWT.RADIO);
		btnFReadModerate.setText("Moderate");
		btnFReadModerate.setBounds(10, 24, 111, 20);
		btnFReadModerate.setSelection(true);

		Button btnFReadHigh = new Button(grpFReadEfficiency, SWT.RADIO);
		btnFReadHigh.setText("High");
		btnFReadHigh.setBounds(135, 24, 139, 20);
		// FRe-Read
		// IOzone

		// Custom
		Group grpCustom = new Group(shell, SWT.BORDER | SWT.SHADOW_OUT);
		grpCustom.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpCustom.setText("Custom");
		grpCustom.setBounds(0, 445, 754, 173);
		// grpCustom.setSelection(false);

		// Lookup
		Group grpLookupTime = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpLookupTime.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpLookupTime.setText("Lookup Time");
		grpLookupTime.setBounds(151, 26, 113, 67);

		Button btnLookupLow = new Button(grpLookupTime, SWT.RADIO);
		btnLookupLow.setBounds(10, 35, 43, 20);
		btnLookupLow.setText("Low");
		btnLookupLow.setSelection(true);

		Button btnLookupHigh = new Button(grpLookupTime, SWT.RADIO);
		btnLookupHigh.setBounds(59, 35, 47, 20);
		btnLookupHigh.setText("High");
		// Lookup

		// // Concurrency
		// Group grpConcurrencyPerformance = new Group(grpCustom, SWT.BORDER |
		// SWT.SHADOW_ETCHED_IN);
		// grpConcurrencyPerformance.setFont(SWTResourceManager.getFont("Segoe
		// UI", 9, SWT.BOLD));
		// grpConcurrencyPerformance.setText("Concurrency Performance");
		// grpConcurrencyPerformance.setBounds(363, 26, 347, 88);
		//
		// Button btnConcurrencyHigh = new Button(grpConcurrencyPerformance,
		// SWT.RADIO);
		// btnConcurrencyHigh.setBounds(10, 40, 111, 20);
		// btnConcurrencyHigh.setText("High");
		// btnConcurrencyHigh.setSelection(true);
		//
		// Button btnConcurrencyModerate = new Button(grpConcurrencyPerformance,
		// SWT.RADIO);
		// btnConcurrencyModerate.setBounds(204, 40, 111, 20);
		// btnConcurrencyModerate.setText("Moderate");
		// // Concurrency
		//
		// // Resilience
		// Group grpFaultResilience = new Group(grpCustom, SWT.BORDER |
		// SWT.SHADOW_ETCHED_IN);
		// grpFaultResilience.setFont(SWTResourceManager.getFont("Segoe UI", 9,
		// SWT.BOLD));
		// grpFaultResilience.setText("Fault Resilience");
		// grpFaultResilience.setBounds(716, 26, 442, 88);
		//
		// Button btnResilienceHigh = new Button(grpFaultResilience, SWT.RADIO);
		// btnResilienceHigh.setBounds(10, 43, 111, 20);
		// btnResilienceHigh.setText("High");
		// btnResilienceHigh.setSelection(true);
		//
		// Button btnResilienceModerate = new Button(grpFaultResilience,
		// SWT.RADIO);
		// btnResilienceModerate.setBounds(220, 43, 111, 20);
		// btnResilienceModerate.setText("Moderate");
		// // Resilience

		// Access Control
		Group grpAccessControlPerformance = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpAccessControlPerformance.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD));
		grpAccessControlPerformance.setText("Access Control Performance");
		grpAccessControlPerformance.setBounds(270, 26, 175, 67);

		Button btnAccessHigh = new Button(grpAccessControlPerformance,
				SWT.RADIO);
		btnAccessHigh.setBounds(10, 36, 67, 20);
		btnAccessHigh.setText("High");
		btnAccessHigh.setSelection(true);

		Button btnAccessModerate = new Button(grpAccessControlPerformance,
				SWT.RADIO);
		btnAccessModerate.setBounds(83, 36, 72, 20);
		btnAccessModerate.setText("Moderate");
		// Access Control

		// Metadata access
		Group grpMetadataAccess = new Group(grpCustom, SWT.BORDER
				| SWT.SHADOW_ETCHED_IN);
		grpMetadataAccess.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.BOLD));
		grpMetadataAccess.setText("Metadta Access Performance");
		grpMetadataAccess.setBounds(451, 26, 181, 67);

		Button btnMetadataHigh = new Button(grpMetadataAccess, SWT.RADIO);
		btnMetadataHigh.setBounds(10, 37, 73, 20);
		btnMetadataHigh.setText("High");
		btnMetadataHigh.setSelection(true);

		Button btnMetadataModerate = new Button(grpMetadataAccess, SWT.RADIO);
		btnMetadataModerate.setBounds(89, 37, 72, 20);
		btnMetadataModerate.setText("Moderate");
		// Metadata access

		Button btnSuggest = new Button(shell, SWT.NONE);
		btnSuggest.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnFileSmall.getSelection()) {
					selectionMap.put(Parameters.FILE_SIZE,
							btnFileSmall.getText());
				} else {
					selectionMap.put(Parameters.FILE_SIZE,
							btnFileLarge.getText());
				}

				if (btnFileFew.getSelection()) {
					selectionMap.put(Parameters.NUMBER_OF_FILES,
							btnFileFew.getText());
				} else {
					selectionMap.put(Parameters.NUMBER_OF_FILES,
							btnFileMany.getText());
				}

				if (btnModeratelyScalable.getSelection()) {
					selectionMap.put(Parameters.SCALABILITY,
							btnModeratelyScalable.getText());
				} else {
					selectionMap.put(Parameters.SCALABILITY,
							btnHighlyScalable.getText());
				}

				if (btnRandomYes.getSelection()) {
					selectionMap.put(Parameters.RANDOM_ACCESS,
							btnRandomYes.getText());
				} else {
					selectionMap.put(Parameters.RANDOM_ACCESS,
							btnRandomNo.getText());
				}

				if (btnMetadataHigh.getSelection()) {
					selectionMap.put(Parameters.METADATA, btnMetaYes.getText());
				} else {
					selectionMap.put(Parameters.METADATA, btnMetaNo.getText());
				}

				if (btnMetadataHigh.getSelection()) {
					selectionMap.put(Parameters.STORAGE_TYPE,
							btnStorageBlock.getText());
				} else {
					selectionMap.put(Parameters.STORAGE_TYPE,
							btnStorageObject.getText());
				}

				Suggestion suggestion = new Suggestion();
				String recommendation = suggestion.getGeneralSuggestion(
						selectionMap).getFileSytem();

				MessageBox box = new MessageBox(shell, SWT.ICON_WORKING);
				box.setText("Reccommendation");
				box.setMessage(recommendation);
				box.open();
				// MessageDialog.open(MessageDialog.INFORMATION, shell,
				// "Reccomendation",
				// "Recommended File System ::" + recommendation, SWT.NONE);
			}
		});
		btnSuggest.setGrayed(true);
		btnSuggest.setToolTipText("Suggest a file system");
		btnSuggest.setBounds(204, 637, 331, 30);
		btnSuggest.setText("SUGGEST");

	}
}
