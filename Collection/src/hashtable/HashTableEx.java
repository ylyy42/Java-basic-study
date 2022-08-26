package hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fail", "1234");
		map.put("winter", "12345");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			System.out.println("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
		scanner.close();
	}

}
