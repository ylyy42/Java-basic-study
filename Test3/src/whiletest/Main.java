package whiletest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		while(num > 0) {
			if(num > 0 && num <= 100) {
				result += num;
				
				num--;
			} else {
				System.out.println("�Է��Ҽ��ִ� ������ 100������ ���� �����Դϴ�.");
				break;
			}
		}
		
		sc.close();
		
		if(result != 0) {
			System.out.println(result);
		}
	}

}
