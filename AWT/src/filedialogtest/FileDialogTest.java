package filedialogtest;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Parent");
		f.setSize(300, 200);
		
		FileDialog fileOpen = new FileDialog(f, "File Open", FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("C:\\Windows");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
	}

}
