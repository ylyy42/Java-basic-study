
public class ArrEx15 {
	public static void main(String[] args) {
		String src = "SOSHELP";
		String[] morse = {".-","-...","-.-","-..",".",
						"..-.","--.","....","..",".---",
						".--.",".-..","--","-.","---",
						".--.","--.-",".-.","...","-",
						"..-","...-",".--","-..-","-.--",
						"--.."};
		String result = "";
		for(int i = 0; i < src.length(); i++) {
			result += morse[src.charAt(i)-'A'];
		}
		System.out.println(result);
	}
}
