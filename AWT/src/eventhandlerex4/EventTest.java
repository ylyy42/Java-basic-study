package eventhandlerex4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest {
	private JFrame frame;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public EventTest() {
		frame = new JFrame("event handler example");
		btn1 = new JButton("Button1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("Button3");
		btn4 = new JButton("Button4");
		btn5 = new JButton("Button5");
	}

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button1 click!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button2 click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button3 click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button4 click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button5 click!");
			}
		});

		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.EAST);
		frame.add(btn5, BorderLayout.CENTER);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.startFrame();
	}
}
