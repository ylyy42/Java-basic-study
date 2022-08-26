package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator implements ActionListener, WindowListener {
	private Frame f;
	private Panel p;
	private TextField tf;
	private Button[] btn;
	private int num1, num2;
	private char op;
	private int res;
	private Font font;

	public Calculator() {
		f = new Frame("°è»ê±â");
		num1 = 0;
		num2 = 0;
		res = 0;
		op = ' ';
		tf = new TextField();
		p = new Panel();
		btn = new Button[16];
		String strArr[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+" };

		p.setBackground(Color.PINK);
		p.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(strArr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}

		f.add(tf, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);

		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(this);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		char c = e.getActionCommand().charAt(0);

		if (Character.isDigit(c)) {
			if (tf.getText().equals("0")) {
				tf.setText(e.getActionCommand());
			} else {
				String cur = tf.getText();
				tf.setText(cur + e.getActionCommand());
			}
		} else {
			if (c == '=') {
				num2 = Integer.parseInt(tf.getText());
				switch (op) {
				case '+':
					res = num1 + num2;
					break;
				case '-':
					res = num1 - num2;
					break;
				case '*':
					res = num1 * num2;
					break;
				case '/':
					res = num1 / num2;
				}
				tf.setText(String.valueOf(res));
			} else {
				op = c;
				num1 = Integer.parseInt(tf.getText());
				tf.setText("");
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
