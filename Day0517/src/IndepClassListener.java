import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");		
				IndepClassListener.this.setTitle(b.getText());
			}
		}); // Action 리스너 달기
		

		setSize(350, 150);
		setVisible(true);	
	}
	
//	private class MyActionListener implements ActionListener { 
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action"))
//				b.setText("액션");
//			else
//				b.setText("Action");		
//			IndepClassListener.this.setTitle(b.getText());
//		}
//	}

	public static void main(String [] args) {
		new IndepClassListener();
	}

}

