package baseball;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random makeStrikeNums = new Random();
		int[] strikeNums = new int[3];
		int[] userNums = new int[strikeNums.length];
		int strike = 0;
		int ball = 0;

		// 모든요소가 서로다른 난수 배열생성
		for (int i = 0; i < strikeNums.length; i++) {
			strikeNums[i] = makeStrikeNums.nextInt(10);
		}

		for (int i = 0; i < strikeNums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (strikeNums[i] == strikeNums[j]) {
					strikeNums[i] = makeStrikeNums.nextInt(10);
					i--;
				}
			}
		}

		while (strike < 3) {
			strike = 0;
			ball = 0;
			System.out.println("Input Number...");

			for (int i = 0; i < userNums.length; i++) {
				int num = sc.nextInt();

				userNums[i] = num;
			}

			for (int i = 0; i < strikeNums.length; i++) {
				for (int j = 0; j < userNums.length; j++) {
					if (i == j) {
						if (strikeNums[i] == userNums[j]) {
							strike++;
						}
					} else {
						if (strikeNums[i] == userNums[j]) {
							ball++;
						}
					}
				}

			}
			System.out.println("Strike : " + strike + ", Ball : " + ball);
		}
		sc.close();
		System.out.println("Game Over!!");
	}

}
