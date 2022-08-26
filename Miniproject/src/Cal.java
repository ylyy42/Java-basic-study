import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal extends WindowAdapter implements ActionListener {
	private JFrame jframe;
	private JPanel jpanel;
	private JTextField jtextField;
	private String[] operation;
	private String a, b;
	private double c;

	public Cal() {
		jframe = new JFrame("계산기");
		jpanel = new JPanel();
		jtextField = new JTextField();
		a = "";
		b = "";
		c = 0;
		operation = new String[] { "" };

		String[] buttonsName = { "/", "*", "+", "7", "8", "9", "4", "5", "6", "1", "2", "3", "-", "0", "=" };
		JButton[] buttons = new JButton[buttonsName.length];

		jtextField.setHorizontalAlignment(JTextField.RIGHT); // 텍스트가 오른쪽에서부터 나오게
		jtextField.setEditable(false); // 텍스트 못쓰게
		jtextField.setBackground(Color.white); // 하얀색 바탕

		jpanel.setLayout(new GridLayout(5, 0));

		for (int i = 0; i < buttonsName.length; i++) {
			buttons[i] = new JButton(buttonsName[i]);

			buttons[i].addActionListener(this);
			jpanel.add(buttons[i]);
		}

		jframe.add(jtextField, BorderLayout.NORTH);
		jframe.add(jpanel, BorderLayout.SOUTH);

		jframe.addWindowListener(this);
		jframe.setSize(300, 350);
		jframe.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!(e.getActionCommand().equals("+") || e.getActionCommand().equals("-") || 
				e.getActionCommand().equals("*") || e.getActionCommand().equals("/"))) {

			jtextField.setText(jtextField.getText() + e.getActionCommand());

			if (!(e.getActionCommand().equals("="))) {
				if (operation[0] == "") {
					a = jtextField.getText();
				} else {
					b = jtextField.getText();
				}
			}

			if (operation[0] == "+") {
				jtextField.setText(b);
				c = Double.parseDouble(a) + Double.parseDouble(b);
			} else if (operation[0] == "-") {
				jtextField.setText(b);
				c = Double.parseDouble(a) - Double.parseDouble(b);
			} else if (operation[0] == "*") {
				jtextField.setText(b);
				c = Double.parseDouble(a) * Double.parseDouble(b);
			} else if (operation[0] == "/") {
				jtextField.setText(b);
				c = Double.parseDouble(a) / Double.parseDouble(b);
			}

		} else {
			operation[0] = e.getActionCommand();
			jtextField.setText("");

		}

		if (e.getActionCommand().equals("=")) {
			jtextField.setText(String.valueOf(c));
			a = String.valueOf(c);
			b = "";

		}

	}

	public static void main(String[] args) {
		Cal cal = new Cal();
	}

}
