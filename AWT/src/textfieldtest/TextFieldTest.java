package textfieldtest;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TextFieldTest extends WindowAdapter implements ActionListener {

	private JFrame f;
	private JButton btn;
	private Label lid;
	private Label lpwd;
	private TextField id;
	private TextField pwd;
	private TextField tfMsg;
	private final String correct_id = "ylyy42";
	private final String correct_pwd = "y123456";

	public TextFieldTest() {
		f = new JFrame();
		btn = new JButton("�α���");
		f.setSize(500, 120);
		f.setLayout(new FlowLayout());
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		id = new TextField(10);
		pwd = new TextField(10);
		tfMsg = new TextField(40);
		tfMsg.setEditable(false);
		tfMsg.setFocusable(false);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void testStart() {
		pwd.setEchoChar('*');
		btn.addActionListener(this);
		f.addWindowListener(this);
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(tfMsg);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (id.getText().equals("")) {
			tfMsg.setText("ID�� �Է��ϼ���.");
		} else if (pwd.getText().equals("")) {
			tfMsg.setText("Password�� �Է��ϼ���");
		} else if (id.getText().equals(correct_id) && pwd.getText().equals(correct_pwd)) {
			tfMsg.setText("�α����� �Ǿ����ϴ�.");
		} else {
			tfMsg.setText("ID/Password�� �ٽ� �Է��ϼ���.");
		}

	}

	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();
		t.testStart();
	}

}
