public class Ex04_5 {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = new String("abcd");
		String s4 = new String("abcd");
		
		if(s1 == s2) System.out.println("s1�� s2�� ���� ���ڿ�");
		if(s2.equals(s3)) 
			System.out.println("s2�� s3�� ���� ���ڿ�");
		else
			System.out.println("s2�� s3�� �ٸ� ���ڿ�");
		if(s3 == s4)
			System.out.println("s3�� s4�� ���� ���ڿ�");
		else
			System.out.println("s3�� s4�� �ٸ� ���ڿ�");
		
		char ch = 'C';
		if(ch == 'c' || ch == 'C')
			System.out.println("ch = c");
	}
}
