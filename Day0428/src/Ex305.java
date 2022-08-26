import java.util.Scanner;

public class Ex305 {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하세요.");
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = s.nextInt();
		}
		
		System.out.print("3의 배수는");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i]%3 == 0) {
				System.out.print(intArr[i]+" ");
			}
		}s.close();
	}
}
