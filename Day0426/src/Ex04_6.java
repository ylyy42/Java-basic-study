import java.util.Scanner;

public class Ex04_6 {
	public static void main(String[] args) {
		int month = 0;
		System.out.println("���� ���� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		month = s.nextInt();
		
		switch (month) {
			case 3: case 4: case 5:
				System.out.println("���� ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 1: case 2: case 12:
				System.out.println("���� �ܿ��� �����Դϴ�.");
				break;
			default:
				System.out.println("1~12�� �� ���� ���� �Է��ϼ���");
		}
	}
}
