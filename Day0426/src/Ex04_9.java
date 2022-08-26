import java.util.Scanner;

public class Ex04_9 {
	public static void main(String[] args) {
		String str = "35165135";
		char c = ' ';
		if(str != null && !str.equals("")) {
			c = str.charAt(0);
		}
		System.out.println(c);
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("전원을 켜주세요");
		}
	}
}
