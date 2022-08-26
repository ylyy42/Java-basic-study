import java.util.Scanner;

public class Test2_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("È­¾¾ ¿Âµµ? ");
		double f = s.nextDouble();
		double c = (5.0 / 9.0)*(f-32.0);
		System.out.println("¼·¾¾ ¿Âµµ´Â"+c);
	}
}
