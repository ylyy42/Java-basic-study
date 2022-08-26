package awt.db;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Login extends WindowAdapter implements ActionListener {

	private MemberDAO dao;
	private JFrame f;
	private JButton btn;
	private Label lid;
	private Label lpwd;
	private TextField id;
	private TextField pwd;
	private TextField tfMsg;

	public Login() {
		dao = new MemberDAO();
		f = new JFrame();
		btn = new JButton("로그인");
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
			tfMsg.setText("ID를 입력하세요.");
		} else if (pwd.getText().equals("")) {
			tfMsg.setText("Password를 입력하세요");
		} else {
			System.out.println(id.getText());
			System.out.println(pwd.getText());
			
			MemberVo vo = new MemberVo(id.getText(), pwd.getText());
			boolean b = dao.list(vo);
			if(b == true) {
				tfMsg.setText("로그인 되었습니다.");
			} else {
				tfMsg.setText("로그인에 실패했습니다.");
			}
		}

	}

	public static void main(String[] args) {
		Login t = new Login();
		t.testStart();
	}

}
