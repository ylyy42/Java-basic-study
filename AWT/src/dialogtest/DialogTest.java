package dialogtest;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogTest {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 200);
		
		Dialog info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		JLabel msg = new JLabel("This is modal Dialog", JLabel.CENTER);
		JButton ok = new JButton("OK");
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});
		
		info.add(msg);
		info.add(ok);
		
		f.setVisible(true);
		info.setVisible(true);
	}
}
