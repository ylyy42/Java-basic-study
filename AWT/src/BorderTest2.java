import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest2 {
	private Frame frame;
	private Button center, west;
	private TextField tf1;

	public BorderTest2() {
		frame = new Frame("BorderLayout example2");
		west = new Button("button 1");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}
	
	public void startFrame() {
		frame.add(tf1, BorderLayout.NORTH);
		frame.add(west, BorderLayout.WEST);
		frame.add(center, BorderLayout.CENTER);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	public static void main(String[] arg) {
		BorderTest2 border = new BorderTest2();
		border.startFrame();
	}
}
