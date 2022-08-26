package windowlistener;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowTest implements WindowListener {
	private JFrame frame;
	private JButton button1, button2, button3;
	
	public FlowTest() {
		frame = new JFrame("adapter example");
		button1 = new JButton("OK");
		button2 = new JButton("Open");
		button3 = new JButton("Close");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void windowClosed(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		FlowTest g = new FlowTest();
		g.startFrame();
	}
}
