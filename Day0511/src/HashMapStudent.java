import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudent {
	public static void main(String[] args) {
		HashMap<String, Student> smap = new HashMap<String, Student>();
		
		smap.put("이순신", new Student(1, "010-333-7777"));
		smap.put("유관순", new Student(2, "010-444-7777"));
		smap.put("안중근", new Student(3, "010-555-7777"));
		smap.put("연개소문", new Student(4, "010-666-7777"));
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("누구의 전화번호가 궁금하세요?");
			String name = s.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student s1 = smap.get(name);
			if(s1 == null) {
				System.out.println(name + "없는 학생입니다.");
			} else {
				System.out.println(name + "의 전화번호는 " + s1.getTel() + " 입니다");
			}
		}
		System.out.println("정상 종료 되었습니다.");
	}

}
