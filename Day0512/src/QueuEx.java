import java.util.*;

public class QueuEx {
	static Queue q = new LinkedList();
	static final int SIZE = 5;
	public static void main(String[] args) {
		System.out.println("help�� �Է��Ͻø� ������ ���Ǽ� �ֽ��ϴ�.");
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
//			if(!input.equals("") && input != null) continue;
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equals("help")) {
					System.out.println("help - ����");
					System.out.println("q �Ǵ� Q - ����");
					System.out.println("history - �ֱ� �Է� ���");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);
					LinkedList tmp=(LinkedList)q;
				    ListIterator it=tmp.listIterator();
					while(it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("����");
				break;
			}
		}
	}
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		if(q.size() > SIZE) {
			save(input);
			q.remove();
		}
	}
}
