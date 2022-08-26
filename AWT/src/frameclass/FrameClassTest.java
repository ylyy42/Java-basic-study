package frameclass;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class FrameClassTest extends WindowAdapter {
	private JFrame f;
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public FrameClassTest() {
		f = new JFrame("Login");
		f.setSize(300, 200);

		f.addWindowListener(this);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameClassTest();
	}
}
