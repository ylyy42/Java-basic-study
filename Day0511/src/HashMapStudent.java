import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudent {
	public static void main(String[] args) {
		HashMap<String, Student> smap = new HashMap<String, Student>();
		
		smap.put("�̼���", new Student(1, "010-333-7777"));
		smap.put("������", new Student(2, "010-444-7777"));
		smap.put("���߱�", new Student(3, "010-555-7777"));
		smap.put("�����ҹ�", new Student(4, "010-666-7777"));
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("������ ��ȭ��ȣ�� �ñ��ϼ���?");
			String name = s.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student s1 = smap.get(name);
			if(s1 == null) {
				System.out.println(name + "���� �л��Դϴ�.");
			} else {
				System.out.println(name + "�� ��ȭ��ȣ�� " + s1.getTel() + " �Դϴ�");
			}
		}
		System.out.println("���� ���� �Ǿ����ϴ�.");
	}

}
