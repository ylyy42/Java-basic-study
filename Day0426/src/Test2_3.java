import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;

public class Test2_3 {
	public static void main(String[] args) {
		double r = 0, h = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("������� �ظ� ��������? ");
		r = s.nextDouble();
		System.out.print("������� ���̴�? ");
		h = s.nextDouble();
		System.out.println("������� ���Ǵ� "+ 3.14*r*r*h);
	}
}
