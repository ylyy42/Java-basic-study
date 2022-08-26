import java.util.Scanner;

public class Ex306 {
	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner s = new Scanner(System.in);
		
		int money = s.nextInt();
		int result;
		
		for(int i = 0; i < unit.length; i++) {
			result = money/unit[i];
			if(result != 0) {
				System.out.println(unit[i]+"¿ø ÀÇ °¹¼ö´Â"+result);
				money -= unit[i]*result;
			}
		}
	}
}
