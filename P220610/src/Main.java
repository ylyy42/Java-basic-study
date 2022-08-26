import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		
		print(num, num2);
	}
	
	static void print(double num, double num2) {
		if(num >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		} else if(num >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		} else{
			System.out.println("C");
		}
	}
}
