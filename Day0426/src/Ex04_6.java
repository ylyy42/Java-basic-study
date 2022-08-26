import java.util.Scanner;

public class Ex04_6 {
	public static void main(String[] args) {
		int month = 0;
		System.out.println("현재 월을 입력하세요");
		Scanner s = new Scanner(System.in);
		month = s.nextInt();
		
		switch (month) {
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			case 1: case 2: case 12:
				System.out.println("현재 겨울은 가을입니다.");
				break;
			default:
				System.out.println("1~12월 중 현재 월을 입력하세요");
		}
	}
}
