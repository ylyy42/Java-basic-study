import java.util.Scanner;

public class Test2_7 {
	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int x = s.nextInt();
		b1 = (x%4 == 0)&&(x%5 == 0);
		b2 = (x%4 == 0)||(x%5 == 0);
		b3 = b2 && !b1;
		b4 = (x%4 == 0)^(x%5 == 0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
