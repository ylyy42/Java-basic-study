import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c;
		char[] cs = new char[10];

		for (int i = 0; i < 10; i++) {
			c = sc.next().charAt(0);
			cs[i] = c;
			if (i == 0 || i == 3 || i == 6) {
				System.out.print((i == 6) ? cs[i] : cs[i] + " ");
			}
		}
	}
}
