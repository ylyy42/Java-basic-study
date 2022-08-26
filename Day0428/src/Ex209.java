import java.util.Scanner;

public class Ex209 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력 >>");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("점 입력 >>");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double dist = Math.sqrt((x2-x)*(x2-x)+(y2-y2)*(y2-y2));
		if(dist < r) {
			System.out.println("점이 원 안에 있습니다.");
		} else {
			System.out.println("점이 원 안에 없습니다.");
		}
		s.close();
	}
}
