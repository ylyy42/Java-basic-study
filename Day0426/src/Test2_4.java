import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;

public class Test2_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요: ");
		int t = s.nextInt();
		int se = t % 60;
		int m = (t/60) % 60;
		int h = (t/60)/60;
		System.out.println(h+"시간"+m+"분"+se+"초");
	}
}
