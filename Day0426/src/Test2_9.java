import java.util.Scanner;

public class Test2_9 {
	public static void main(String[] args) {
		int j,g,i;
		boolean b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�����̼����� : ");
		j = s.nextInt();
		System.out.print("�����̼����� : ");
		g = s.nextInt();
		System.out.print("�Ϲ��̼����� : ");
		i = s.nextInt();
		
		b = (j+g+i)>=140 && (j>=70) && ((g>=30 && i>=30) || g+i>=80);
				
		System.out.println(b?"��������":"�����Ұ�");
	}
}
