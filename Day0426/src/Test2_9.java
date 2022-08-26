import java.util.Scanner;

public class Test2_9 {
	public static void main(String[] args) {
		int j,g,i;
		boolean b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("전공이수학점 : ");
		j = s.nextInt();
		System.out.print("교양이수학점 : ");
		g = s.nextInt();
		System.out.print("일반이수학점 : ");
		i = s.nextInt();
		
		b = (j+g+i)>=140 && (j>=70) && ((g>=30 && i>=30) || g+i>=80);
				
		System.out.println(b?"졸업가능":"졸업불가");
	}
}
