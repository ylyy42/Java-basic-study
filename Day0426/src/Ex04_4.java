import java.util.Scanner;

public class Ex04_4 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = ' ';
		System.out.println("������ �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		score = s.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score < 74) {
				opt = '-';
			}
		} else {
			grade = 'D';
		}
		System.out.println("����� ������"+grade+opt+"�Դϴ�.");
	}
}
