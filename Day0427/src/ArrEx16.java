import javax.swing.JOptionPane;

public class ArrEx16 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		String temp = "";
		int count = 0;
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է��ϼ���. �������� -1�� �Է��ϼ���.");
			if(temp == null || temp.equals("-1")) 
				break;
				System.out.println("�Է°� : " + temp);
				input = Integer.parseInt(temp);
				
				if(answer > input)
					System.out.println("�� ū ���� �Է��ϼ���.");
				else if(answer < input)
					System.out.println("�� ���� ���� �Է��ϼ���.");
				else
					break;
		} while(true);
		System.out.println("�õ�Ƚ�� : " + count);
	}
}
