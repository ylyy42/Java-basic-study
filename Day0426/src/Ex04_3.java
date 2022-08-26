import java.util.Scanner;

public class Ex04_3 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하진 숫자는 0이 아닙니다.");
		}
	}
}
