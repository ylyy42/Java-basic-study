import java.util.Scanner;

public class Ex04_8 {
	public static void main(String[] args) {
		int user, com;
		System.out.println("����(1), ����(2), ��(3)�� �ϳ��� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		user = s.nextInt();
		com = (int)(Math.random()*3)+1;
		System.out.println("�����"+user+"�Դϴ�");
		System.out.println("��ǻ�ʹ�"+com+"�Դϴ�");
		
		switch(user-com) {
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case -1: case 2:
				System.out.println("����� �����ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
				break;
		}
	}
}
