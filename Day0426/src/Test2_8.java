import java.util.Scanner;

public class Test2_8 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� ������ �Է��ϼ���");
		int num = s.nextInt();
		
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		//num /= 10;
		System.out.println(sum);

	}
}
