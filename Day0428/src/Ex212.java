import java.util.Scanner;

public class Ex212 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		String op = s.next();
		double y = s.nextDouble();
		double result = 0.0;
		
		if(op.equals("+")) {
			result = x+y;
		} else if(op.equals("-")) {
			result = x-y;
		} else if(op.equals("*")) {
			result = x*y;
		} else if(op.equals("/")) {
			if(y==0) {
				System.out.println("0으로 나눌수 없습니다.");
				return;
			} else {
				result = x/y;
			}
		} else {
			System.out.println("사칙연산이 아닙니다.");
			return;
		}
		System.out.println(x + op + y+"연산의 결과는" + result);
		
		s.close();
	}
}
