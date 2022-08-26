package windowlistener;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowTest2 extends WindowAdapter {
	private JFrame frame;
	private JButton button1, button2, button3;
	
	public FlowTest2() {
		frame = new JFrame("adapter example");
		button1 = new JButton("OK");
		button2 = new JButton("Open");
		button3 = new JButton("Close");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void starFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		FlowTest2 g = new FlowTest2();
		g.starFrame();
	}
}
