
public class ArrTest {
	static int add(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(new int[]{100, 200, 300, 400, 500});
		System.out.println();
	}
}
