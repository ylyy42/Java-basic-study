import java.util.Scanner;

public class Ex209 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �߽ɰ� ������ �Է� >>");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("�� �Է� >>");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double dist = Math.sqrt((x2-x)*(x2-x)+(y2-y2)*(y2-y2));
		if(dist < r) {
			System.out.println("���� �� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("���� �� �ȿ� �����ϴ�.");
		}
		s.close();
	}
}
