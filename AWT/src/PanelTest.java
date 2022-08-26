import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest {
	private JFrame f;
	private JButton ok, cancel;
	private JPanel p;
	private JTextField tf1;
	
	public PanelTest() {
		f = new JFrame("panel example");
		ok = new JButton("전송");
		cancel = new JButton("삭제");
		tf1 = new JTextField("Input...");
		p = new JPanel();
	}
	
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();
	}
}
