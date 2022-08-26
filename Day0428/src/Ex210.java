import java.util.Scanner;

public class Ex210 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력 >>");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r1 = s.nextDouble();
		
		System.out.println("두번 째 원의 중심과 반지름 입력 >>");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double r2 = s.nextDouble();
		
		double dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y2)*(y2-y2));
		double rSum = r1 + r2;
		
		if(dist < rSum) {
			System.out.println("원이 겹친다");
		} else {
			System.out.println("원이 않겹친다");
		}
		s.close();
	}
}
