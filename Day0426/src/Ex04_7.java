public class Ex04_7 {
	public static void main(String[] args) {
		char ch = 'C';
		if(ch == 'c' || ch == 'C')
			System.out.println("ch = c");
		String str = new String("c");
		if(str == "c" || str == "C")
			System.out.println("str = c");
		if(str.equals("c") || str.equals("C"))
			System.out.println("str = c");
		if(str.equalsIgnoreCase("C"))
			System.out.println("str = c");
		System.out.println();
	}
}
