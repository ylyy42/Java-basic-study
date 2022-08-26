package jungol;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		area(r);
	}
	
	static void area(double r) {
		double pie = 3.14;
		double result = Math.round((r * r * pie)* 100) / 100.0;
		
		
		System.out.printf("%.2f\n", result);
//		System.out.println(result);
	}
}