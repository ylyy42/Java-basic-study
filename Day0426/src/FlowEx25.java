import java.io.IOException;

public class FlowEx25 {
	public static void main(String[] args) throws IOException {
		int input = 0;
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		do {
				input = System.in.read();
			System.out.println((char)input);
		} while(input != -1 && input !='x');
	}
}
