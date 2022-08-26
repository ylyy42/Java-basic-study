import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int num = s.nextInt();
		int mul = num * num;
		System.out.println(num+"의 제곱은 "+mul);
	}
}
