import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���.");
				scanner.next();
			}
		}
		scanner.close();
	}
}
