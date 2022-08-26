package labeltest;

import java.awt.Label;

import javax.swing.JFrame;

public class LabelTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Login");
		f.setSize(300, 300);
		f.setLayout(null);
		
		Label id = new Label("ID : ");
		id.setBounds(50, 50, 30, 10); //50 50위치에 30, 10 크기로
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50, 65, 100, 10);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
	}

}
