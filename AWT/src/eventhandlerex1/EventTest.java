package eventhandlerex1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest implements ActionListener {
	private JFrame f;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public EventTest() {
		f = new JFrame("event handler example");
		btn1 = new JButton("Button1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("Button3");
		btn4 = new JButton("Button4");
		btn5 = new JButton("Button5");
	}
	
	public void startFrame() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.WEST);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if(e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if(e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if(e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
		if(e.getActionCommand().equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
	}
	
	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.startFrame();
	}
	
}
