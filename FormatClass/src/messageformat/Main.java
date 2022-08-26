package messageformat;

import java.text.MessageFormat;

public class Main {
	public static void main(String[] args) {
		String id = "java";
		String name = "À±¼¼À±";
		String tel = "010-123-4567";
		
		String text = "È¸¿ø ID : {0} \nÈ¸¿ø ÀÌ¸§ : {1} \nÈ¸¿ø ÀüÈ­: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0}, {1}, {2})";
		Object[] arguments = {"java", "À±¼¼À±", "010-123-4567"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
