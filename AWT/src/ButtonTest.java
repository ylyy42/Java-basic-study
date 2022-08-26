import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest implements ActionListener {

	private JFrame f;
	private JButton b;

	public ButtonTest() {
		f = new JFrame("Login");
		b = new JButton("Ȯ��");
		f.setSize(300, 200);
		f.setLayout(null);

		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (b.getLabel().equals("Ȯ��")) {
			b.setLabel("���");
		} else if (b.getLabel().equals("���")) {
			b.setLabel("Ȯ��");
		}

	}

	public static void main(String[] args) {
		new ButtonTest();
	}

}
