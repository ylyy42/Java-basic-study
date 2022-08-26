package eventhandlerex2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest {
	private JFrame f;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public EventTest() {
		f = new JFrame("event handler example2");
		btn1 = new JButton("Button1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("Button3");
		btn4 = new JButton("Button4");
		btn5 = new JButton("Button5");
	}
	
	public void starFrame() {
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());
		
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.WEST);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.starFrame();
	}
}
