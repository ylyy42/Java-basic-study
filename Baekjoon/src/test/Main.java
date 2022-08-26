package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] scores = new int[num];
		int sum = 0;
		double result = 0;
		
		for(int i = 0; i < num; i++) {
			int score = sc.nextInt();
			scores[i] = score;
			sum += scores[i];
		}
		sc.close();
		result = Math.round(((double)sum / num) * 10) / 10.0;
		
		System.out.println("avg : " + result);
		
		if(result >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
