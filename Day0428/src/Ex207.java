import java.util.Scanner;

public class Ex207 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		int x1 = 100, y1 = 100;
		int x2 = 100, y2 = 100;
		Scanner s = new Scanner(System.in);
		System.out.println("점(x,y)의 좌표를 입력하시오 >>  ");
		x = s.nextInt();
		y = s.nextInt();
		
		if((x1 <= x && x <= x2) || (y1 <= y && y <= y2)) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		} else {
			System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
		}
		s.close();
	}
}
