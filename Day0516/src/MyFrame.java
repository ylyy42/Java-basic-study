import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Border Layout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new BorderLayout(10,20));
		
		contentPane.add(new Button("OK"),BorderLayout.CENTER);
		contentPane.add(new Button("Cancel"),BorderLayout.EAST);
		contentPane.add(new Button("Ignore"),BorderLayout.WEST);
		contentPane.add(new Button("OK"),BorderLayout.SOUTH);
		contentPane.add(new Button("Cancel"),BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame m1 = new MyFrame();
//		m1.
	}

}
