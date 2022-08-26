package choicetest;

import java.awt.Choice;

import javax.swing.JFrame;

public class ChoiceTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Choice - Select");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(100, 50);
		day.setLocation(100, 70);
		
		f.add(day);
		f.setVisible(true);
	}
}
