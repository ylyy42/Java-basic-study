package obesity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int obesity = weight + 100 - height;
		
		if(obesity > 0) {
			System.out.println(obesity);
			System.out.println("Obesity");
		} else {
			System.out.println(obesity);
		}
	}

}
