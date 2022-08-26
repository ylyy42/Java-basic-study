package eventhandlerex3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest {
	private JFrame f;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public EventTest() {
		f = new JFrame("event handler example3");
		btn1 = new JButton("Button1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("Button3");
		btn4 = new JButton("Button4");
		btn5 = new JButton("Button5");
	}

	public class InnerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Button1")) {
				System.out.println("Button 1 Click!");
			}
			if (e.getActionCommand().equals("Button2")) {
				System.out.println("Button 2 Click!");
			}
			if (e.getActionCommand().equals("Button3")) {
				System.out.println("Button 3 Click!");
			}
			if (e.getActionCommand().equals("Button4")) {
				System.out.println("Button 4 Click!");
			}
			if (e.getActionCommand().equals("Button5")) {
				System.out.println("Button 5 Click!");
			}
		}
	}

	public void startFrame() {
		btn1.addActionListener(new InnerHandler());
		btn2.addActionListener(new InnerHandler());
		btn3.addActionListener(new InnerHandler());
		btn4.addActionListener(new InnerHandler());
		btn5.addActionListener(new InnerHandler());

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
		g.startFrame();
	}
}
