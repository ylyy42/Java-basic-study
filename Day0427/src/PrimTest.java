import java.util.Scanner;

public class PrimTest {
	static boolean isPrime(int num){
		for(int i = 2; i<num; i++) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		else
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
	}
}
