import java.util.Scanner;

public class Ex207 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		int x1 = 100, y1 = 100;
		int x2 = 100, y2 = 100;
		Scanner s = new Scanner(System.in);
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ� >>  ");
		x = s.nextInt();
		y = s.nextInt();
		
		if((x1 <= x && x <= x2) || (y1 <= y && y <= y2)) {
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		}
		s.close();
	}
}
