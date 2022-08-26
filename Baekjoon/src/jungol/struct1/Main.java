package jungol.struct1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Student[] stuArr = new Student[num];
		Student temp;

		for(int i = 0; i < num; i++) {
			stuArr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			stuArr[i].sum();
		}
		
		sc.close();
		
		for(int i = 0; i < num; i++) {
			for(int j = num - 1; j > 0; j--) {
				if(stuArr[j].sum > stuArr[j - 1].sum) {
					temp = stuArr[j - 1];
					stuArr[j - 1] = stuArr[j];
					stuArr[j] = temp;
				}
			}
		}

		

		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i].print();
		}

	}


}

class Student {
	String name;
	int[] scoreArr;
	int sum;

	Student(String name, int score1, int score2, int score3){
		this.name = name;
		this.scoreArr = new int[] {score1,score2,score3};
	}

	int sum() {
		for(int j = 0; j < scoreArr.length; j++) {
			sum += scoreArr[j];
		}

		return sum;
	}

	void print() {
		System.out.println(name + " " + 
				scoreArr[0] + " " + scoreArr[1] + 
				" " + scoreArr[2] + " " + sum);
	}
}