public class Ex04_5 {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = new String("abcd");
		String s4 = new String("abcd");
		
		if(s1 == s2) System.out.println("s1과 s2는 같은 문자열");
		if(s2.equals(s3)) 
			System.out.println("s2과 s3은 같은 문자열");
		else
			System.out.println("s2과 s3은 다른 문자열");
		if(s3 == s4)
			System.out.println("s3과 s4는 같은 문자열");
		else
			System.out.println("s3과 s4은 다른 문자열");
		
		char ch = 'C';
		if(ch == 'c' || ch == 'C')
			System.out.println("ch = c");
	}
}
