import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int[] nums = new int[100];
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			num = sc.nextInt();

			if (!(num == -1)) {
				nums[i] = num;
				count++;
			} else {
				if (count < 3) {
					for (int j = 0; j < count; j++) {
						System.out.print(nums[j] + " ");
					}
				} else {
					System.out.println(nums[count - 3] + " " + nums[count - 2] + " " + nums[count - 1]);
				}
				break;
			}
		}
		sc.close();
	}

}