import java.util.Scanner;

public class Ex210 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �߽ɰ� ������ �Է� >>");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r1 = s.nextDouble();
		
		System.out.println("�ι� ° ���� �߽ɰ� ������ �Է� >>");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double r2 = s.nextDouble();
		
		double dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y2)*(y2-y2));
		double rSum = r1 + r2;
		
		if(dist < rSum) {
			System.out.println("���� ��ģ��");
		} else {
			System.out.println("���� �ʰ�ģ��");
		}
		s.close();
	}
}
