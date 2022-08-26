package canvastest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Panel;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CanvasTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Canvas test");
		f.setSize(300, 200);

		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		Panel p = new Panel();
		p.setBackground(Color.pink);
		p.add(new JButton("1st"));
		p.add(new JButton("2st"));
		p.add(new JButton("3st"));
		p.add(new JButton("4st"));
		
		sp.add(p);
		f.add(sp);
		f.setVisible(true);
		
//		Canvas c = new Canvas();
//		c.setBackground(Color.PINK);
//		c.setBounds(50, 50, 150, 100);
//		
//		f.add(c);
//		f.setVisible(true);
	}
}
