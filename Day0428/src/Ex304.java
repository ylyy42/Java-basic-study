import java.util.Scanner;

public class Ex304 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("소문자 알파벳을 입력하시오 >> ");
		String str = s.next();
		if(str.length() != 1) {
			System.out.println("한개의 알파벳을 입력하세요");
			return;
		}
		char c = str.charAt(0);
		if(c < 'a' && c > 'z') {
			System.out.println("소문자 a부터 z사이의 문자를 입력하세요.");
			return;
		}
		for(char i = c; i >= 'a'; i--) {
			for(char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
