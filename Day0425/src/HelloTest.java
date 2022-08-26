import java.util.Scanner;

public class HelloTest {
	public static void main(String[] args) {
		double d1 = 0.1;
		double d2 = 10.0;
		float f1 = 0.1f;
		float f2 = 10.0f;
		boolean b1 = (float)d1 == (float)f1;
		boolean b2 = d2 == f2;
		
		System.out.println(b1);
		System.out.println(b2);
		double d = 0.1f;
		System.out.println(d);
	}
}
