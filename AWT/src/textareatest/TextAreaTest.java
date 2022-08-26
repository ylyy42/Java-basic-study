package textareatest;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TexturePaint;

import javax.swing.JFrame;

public class TextAreaTest {

	public static void main(String[] args) {
		JFrame j = new JFrame("Comments");
		j.setSize(400, 200);
		j.setLayout(new FlowLayout());
		
		TextArea comments = new TextArea("하고 싶은 말을 적으세요!",10,50);
		
		j.add(comments);
		comments.selectAll();
		j.setVisible(true);
	}

}
