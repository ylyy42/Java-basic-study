import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���.");
		
		int sum = 0, n = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println(i+">>");
			try {
				n = s.nextInt();	
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				s.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("������ ����"+ sum);
		s.close();
	}
}
