import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		setTitle("½ºÀ® ÇÁ·¹ÀÓ ¶ç¿ì±â~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancel"));
		contentPane.add(new Button("Ignore"));
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancel"));
		contentPane.add(new Button("Ignore"));
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame2 m1 = new MyFrame2();
//		m1.
	}

}
