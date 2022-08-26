import java.util.Scanner;

public class Ex308 {
	static boolean exists(int[] arr, int from, int temp) {
		for(int i = 0; i < from; i++) {
			if(arr[i] == temp) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 몇개?");
		int i = s.nextInt();
		int [] arr = new int[i];
		int temp = 0;
		
		for(int j = 0; j < arr.length; j++) {
			temp = (int)(Math.random()*100+1);
			if(exists(arr,j,temp)) {
				j--;
				continue;
			}
			arr[j] = temp;
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(j == 0) {
				System.out.print(arr[j]+" ");
			} else {
				if(j % 10 == 0)
				System.out.println();
				else
				System.out.print(arr[j]+" ");
			}
		}
		
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("몇개의 정수를 넣을껀가요?");
//		int num = s.nextInt();
//		int array [] = new int [num];
//		
//		for(int i = 0; i < num; i++) {
//			int randomInt = (int)(Math.random()*100 + 1);
//			
//			if(i == 0) {
//				array[i] = randomInt;
//				System.out.println(array[i] + "");
//			}
//			
//			for(int j = 0; j < i; j++) {
//				if(array[j] == randomInt) {
//					i--;
//					break;
//				}
//				if(j == i - 1) {
//					array[i] = randomInt;
//					System.out.println(array[i] + "");
//					if((i % 10 == 9))
//						System.out.println();
//				}
//			}
//		}
	}
}
