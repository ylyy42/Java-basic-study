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
				System.out.println("0���� ������ �����ϴ�.");
				return;
			} else {
				result = x/y;
			}
		} else {
			System.out.println("��Ģ������ �ƴմϴ�.");
			return;
		}
		System.out.println(x + op + y+"������ �����" + result);
		
		s.close();
	}
}
