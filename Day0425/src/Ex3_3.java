import java.util.Scanner;

public class Ex3_3 {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = "abcd";
		System.out.printf("\"abcd\" == \"abcd\"? %b%n","abcd" == "abcd");
		System.out.printf("s1 == \"abcd\"? %b%n",s1 == "abcd");
		System.out.printf("s2 == \"abcd\"? %b%n",s2 == "abcd");
		System.out.println(s1==s3);
		System.out.printf("s1 == s2? %b%n",s1.equals(s2));
		System.out.printf("s2.equalsIgnoreCase(\"AbCd\")? %b%n",s2.equalsIgnoreCase("AbCd"));
	}
}
