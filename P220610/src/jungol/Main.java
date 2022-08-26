package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = {'J','U','N','G','O','L'};
		char str = sc.next().charAt(0);
		sc.close();
		
		boolean b = false;
		for(int i = 0; i < ch.length; i++) {
			if(str == ch[i]) {
				System.out.println(i);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("none");
		}
	}
}
