import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String c = input("ö��");
		String y = input("����");
		whosWin(c,y);
	} 
	
	public static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.print(s);
		String c = in.next();
		return c;
	}
	
	public static void whosWin(String c, String y) {
		if((c.equals("r") && y.equals("r")) || (c.equals("s") && y.equals("s")) || (c.equals("p") && y.equals("p"))) {
			System.out.println("�����ϴ�!");
		} else if ((c.equals("r") && y.equals("s")) || (c.equals("s") && y.equals("p")) || (c.equals("p") && y.equals("r"))) {
			System.out.println("ö�� ��!");
		} else {
			System.out.println("���� ��!");
		}
	}
	
}
