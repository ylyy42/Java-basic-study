import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;

public class Test2_3 {
	public static void main(String[] args) {
		double r = 0, h = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은? ");
		r = s.nextDouble();
		System.out.print("원기둥의 높이는? ");
		h = s.nextDouble();
		System.out.println("원기둥의 부피는 "+ 3.14*r*r*h);
	}
}
