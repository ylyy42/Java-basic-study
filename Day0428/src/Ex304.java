import java.util.Scanner;

public class Ex304 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ��� �Է��Ͻÿ� >> ");
		String str = s.next();
		if(str.length() != 1) {
			System.out.println("�Ѱ��� ���ĺ��� �Է��ϼ���");
			return;
		}
		char c = str.charAt(0);
		if(c < 'a' && c > 'z') {
			System.out.println("�ҹ��� a���� z������ ���ڸ� �Է��ϼ���.");
			return;
		}
		for(char i = c; i >= 'a'; i--) {
			for(char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
