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
				System.out.println("입력할수있는 정수는 100이하의 양의 정수입니다.");
				break;
			}
		}
		
		sc.close();
		
		if(result != 0) {
			System.out.println(result);
		}
	}

}
